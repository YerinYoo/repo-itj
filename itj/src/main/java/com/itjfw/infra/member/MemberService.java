package com.itjfw.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {
	
	@Autowired
	MemberDao memberDao;
	
	public List<MemberDto> memberList(MemberVo vo) {
		return memberDao.memberList(vo);
	}
	
	public Integer getTotalMemberCount(MemberVo memberVo) throws Exception{
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
	
}
