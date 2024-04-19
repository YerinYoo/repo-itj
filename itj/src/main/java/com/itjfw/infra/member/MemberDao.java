package com.itjfw.infra.member;

import java.util.List;

public interface MemberDao {
	
	//멤버 전체 리스트
	public List<MemberDto> memberList(MemberVo memberVo);

	//일정 멤버 셀렉원
	public MemberDto selectMember(MemberDto memberDto);
	
	//멤버 총 카운트 반환
	public int getTotalMemberCount(MemberVo memberVo);
	
	// ----------------------
	
	public int memberInst(MemberDto memberDto);
	
	public int memberUpdt(MemberDto memberDto);

	public int memberUlt(MemberDto memberDto);
	
	public int memberDel(MemberDto memberDto);
}
