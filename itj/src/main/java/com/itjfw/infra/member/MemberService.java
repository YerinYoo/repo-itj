package com.itjfw.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;

	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	public List<MemberDto> memberList(MemberVo vo) {
		return memberDao.memberList(vo);
	}

	public Integer getTotalMemberCount(MemberVo memberVo) throws Exception {
		return memberDao.getTotalMemberCount(memberVo);
	}

	public MemberDto selectMember(MemberDto memberDto) {
		return memberDao.selectMember(memberDto);
	}

	public Integer memberInst(MemberDto memberDto) {
		return memberDao.memberInst(memberDto);
	}

	public Integer memberUpdt(MemberDto memberDto) {
		return memberDao.memberUpdt(memberDto);
	}

	public Integer memberUlt(MemberDto memberDto) {
		return memberDao.memberUlt(memberDto);
	}

	public Integer memberDel(MemberDto memberDto) {
		return memberDao.memberDel(memberDto);
	}

	public List<MemberDto> selectListWithoutPaging() {
		return memberDao.selectListWithoutPaging();
	}

	// 로그인 및 비밀번호 암호화 처리
	public MemberDto authenticate(String ID, String pwd) {
		MemberDto member = memberDao.selectOneById(ID);

		if (member != null && passwordEncoder.matches(pwd, member.getMemberPwd())) {
			return member;
		} else {
			return null;
		}

	}

	public MemberDto selectOneById(String id) {
		MemberDto dto = new MemberDto();
		dto.setMemberID(id);
		return memberDao.selectMember(dto);
	}

	public List<MemberDto> selectManagerListWithoutPaging() {
		return memberDao.selectManagerListWithoutPaging();
	}
	
	public List<MemberDto> selectCompanyListWithoutPaging() {
		return memberDao.selectCompanyListWithoutPaging();
	}

}
