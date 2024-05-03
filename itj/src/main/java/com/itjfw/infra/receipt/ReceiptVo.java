package com.itjfw.infra.receipt;

import com.itjfw.common.base.BaseVo;

public class ReceiptVo extends BaseVo {
	
	
	private String receiptSeq;
	private Integer receiptCount;
	private Integer receiptInventory;
	private Integer receiptStatusCd;
	private String purchaseOrderSeqF;
	
	private String purchaseOrderSeq;
	private String memberSeqF;
	
	private String memberSeq;
	private String memberName;
	
	private Integer productCount;
	private String productSeqF;
	
	private String productSeq;
	private String productName;
	
	
	
	public Integer getProductCount() {
		return productCount;
	}
	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	public String getProductSeqF() {
		return productSeqF;
	}
	public void setProductSeqF(String productSeqF) {
		this.productSeqF = productSeqF;
	}
	public String getProductSeq() {
		return productSeq;
	}
	public void setProductSeq(String productSeq) {
		this.productSeq = productSeq;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getMemberSeqF() {
		return memberSeqF;
	}
	public void setMemberSeqF(String memberSeqF) {
		this.memberSeqF = memberSeqF;
	}
	public String getMemberSeq() {
		return memberSeq;
	}
	public void setMemberSeq(String memberSeq) {
		this.memberSeq = memberSeq;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPurchaseOrderSeq() {
		return purchaseOrderSeq;
	}
	public void setPurchaseOrderSeq(String purchaseOrderSeq) {
		this.purchaseOrderSeq = purchaseOrderSeq;
	}
	public String getReceiptSeq() {
		return receiptSeq;
	}
	public void setReceiptSeq(String receiptSeq) {
		this.receiptSeq = receiptSeq;
	}
	public Integer getReceiptCount() {
		return receiptCount;
	}
	public void setReceiptCount(Integer receiptCount) {
		this.receiptCount = receiptCount;
	}
	public Integer getReceiptInventory() {
		return receiptInventory;
	}
	public void setReceiptInventory(Integer receiptInventory) {
		this.receiptInventory = receiptInventory;
	}
	public Integer getReceiptStatusCd() {
		return receiptStatusCd;
	}
	public void setReceiptStatusCd(Integer receiptStatusCd) {
		this.receiptStatusCd = receiptStatusCd;
	}
	public String getPurchaseOrderSeqF() {
		return purchaseOrderSeqF;
	}
	public void setPurchaseOrderSeqF(String purchaseOrderSeqF) {
		this.purchaseOrderSeqF = purchaseOrderSeqF;
	}
	
}
