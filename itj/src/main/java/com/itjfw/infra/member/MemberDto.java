package com.itjfw.infra.member;

import java.util.Date;

public class MemberDto {

	private String memberSeq;
	private String memberID;
	private String memberPwd;
	private String memberName;
	private Integer memberGenderCd;
	private Integer memberTypeCd;
	private String memberAddr;
	private Integer memberDelNy;
	private Date memberRegDate;
	private Date memberModDate;
	
	//member DTO getter, setter
	public String getMemberSeq() {
		return memberSeq;
	}
	public void setMemberSeq(String memberSeq) {
		this.memberSeq = memberSeq;
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getMemberPwd() {
		return memberPwd;
	}
	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Integer getMemberGenderCd() {
		return memberGenderCd;
	}
	public void setMemberGenderCd(Integer memberGenderCd) {
		this.memberGenderCd = memberGenderCd;
	}
	public Integer getMemberTypeCd() {
		return memberTypeCd;
	}
	public void setMemberTypeCd(Integer memberTypeCd) {
		this.memberTypeCd = memberTypeCd;
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
	}
	public Integer getMemberDelNy() {
		return memberDelNy;
	}
	public void setMemberDelNy(Integer memberDelNy) {
		this.memberDelNy = memberDelNy;
	}
	public Date getMemberRegDate() {
		return memberRegDate;
	}
	public void setMemberRegDate(Date memberRegDate) {
		this.memberRegDate = memberRegDate;
	}
	public Date getMemberModDate() {
		return memberModDate;
	}
	public void setMemberModDate(Date memberModDate) {
		this.memberModDate = memberModDate;
	}
	
	//member DTO toString()
	@Override
	public String toString() {
		return "MemberDto [memberSeq=" + memberSeq + ", memberID=" + memberID + ", memberPwd=" + memberPwd
				+ ", memberName=" + memberName + ", memberGenderCd=" + memberGenderCd + ", memberTypeCd=" + memberTypeCd
				+ ", memberAddr=" + memberAddr + ", memberDelNy=" + memberDelNy + ", memberRegDate=" + memberRegDate
				+ ", memberModDate=" + memberModDate + "]";
	}
	
	

}
