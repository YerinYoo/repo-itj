package com.itjfw.infra.po;

import com.itjfw.common.base.BaseVo;

public class PoVo extends BaseVo {

	private String purchaseOrderSeq;
	private String memberSeqF;
	private String purchaseOrderMemo;
	private String xMemberName;
	
	public String getPurchaseOrderSeq() {
		return purchaseOrderSeq;
	}
	public void setPurchaseOrderSeq(String purchaseOrderSeq) {
		this.purchaseOrderSeq = purchaseOrderSeq;
	}
	public String getMemberSeqF() {
		return memberSeqF;
	}
	public void setMemberSeqF(String memberSeqF) {
		this.memberSeqF = memberSeqF;
	}
	public String getPurchaseOrderMemo() {
		return purchaseOrderMemo;
	}
	public void setPurchaseOrderMemo(String purchaseOrderMemo) {
		this.purchaseOrderMemo = purchaseOrderMemo;
	}
	public String getxMemberName() {
		return xMemberName;
	}
	public void setxMemberName(String xMemberName) {
		this.xMemberName = xMemberName;
	}

	

	

}
