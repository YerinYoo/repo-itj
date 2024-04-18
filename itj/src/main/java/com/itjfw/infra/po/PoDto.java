package com.itjfw.infra.po;

import java.util.Date;

public class PoDto {
	private String purchaseOrderSeq;
	private Integer purchaseOrderDelNy;
	private Date purchaseOrderRegDate;
	private Date purchaseOrderModDate;
	private String purchaseOrderMemo;
	private String memberSeqF;
	
	private String xMemberName;

	public String getPurchaseOrderSeq() {
		return purchaseOrderSeq;
	}

	public void setPurchaseOrderSeq(String purchaseOrderSeq) {
		this.purchaseOrderSeq = purchaseOrderSeq;
	}

	public Integer getPurchaseOrderDelNy() {
		return purchaseOrderDelNy;
	}

	public void setPurchaseOrderDelNy(Integer purchaseOrderDelNy) {
		this.purchaseOrderDelNy = purchaseOrderDelNy;
	}

	public Date getPurchaseOrderRegDate() {
		return purchaseOrderRegDate;
	}

	public void setPurchaseOrderRegDate(Date purchaseOrderRegDate) {
		this.purchaseOrderRegDate = purchaseOrderRegDate;
	}

	public Date getPurchaseOrderModDate() {
		return purchaseOrderModDate;
	}

	public void setPurchaseOrderModDate(Date purchaseOrderModDate) {
		this.purchaseOrderModDate = purchaseOrderModDate;
	}

	public String getPurchaseOrderMemo() {
		return purchaseOrderMemo;
	}

	public void setPurchaseOrderMemo(String purchaseOrderMemo) {
		this.purchaseOrderMemo = purchaseOrderMemo;
	}

	public String getMemberSeqF() {
		return memberSeqF;
	}

	public void setMemberSeqF(String memberSeqF) {
		this.memberSeqF = memberSeqF;
	}

	public String getxMemberName() {
		return xMemberName;
	}

	public void setxMemberName(String xMemberName) {
		this.xMemberName = xMemberName;
	}
	
	
	
}
