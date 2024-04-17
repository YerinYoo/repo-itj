package com.itjfw.infra.member;

import java.util.List;

public interface MemberDao {
	//멤버 전체 리스트
	public List<MemberDto> memberList();
	
	//일정 멤버 셀렉원
	public MemberDto selectMember(MemberDto memberDto);
	
	//멤버 총 카운트 반환
	public Integer getTotalMemberCount(MemberVo memberVo);
	
	// ----------------------
	
	public Integer memberInst(MemberDto memberDto);
	
	public Integer memberUpdt(MemberDto memberDto);

	public Integer memberUlt(MemberDto memberDto);
	
	public Integer memberDel(MemberDto memberDto);
}
