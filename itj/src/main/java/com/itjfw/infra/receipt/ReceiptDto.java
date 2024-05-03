package com.itjfw.infra.receipt;

import java.util.Date;

public class ReceiptDto {

	private String receiptSeq;
	private Integer receiptCount;
	private Integer receiptInventory;
	private Integer receiptDelNy;
	private Integer receiptStatusCd;
	private Date receiptRegDate;
	private Date receiptModDate;
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
	public Integer getReceiptDelNy() {
		return receiptDelNy;
	}
	public void setReceiptDelNy(Integer receiptDelNy) {
		this.receiptDelNy = receiptDelNy;
	}
	public Integer getReceiptStatusCd() {
		return receiptStatusCd;
	}
	public void setReceiptStatusCd(Integer receiptStatusCd) {
		this.receiptStatusCd = receiptStatusCd;
	}
	public Date getReceiptRegDate() {
		return receiptRegDate;
	}
	public void setReceiptRegDate(Date receiptRegDate) {
		this.receiptRegDate = receiptRegDate;
	}
	public Date getReceiptModDate() {
		return receiptModDate;
	}
	public void setReceiptModDate(Date receiptModDate) {
		this.receiptModDate = receiptModDate;
	}
	public String getPurchaseOrderSeqF() {
		return purchaseOrderSeqF;
	}
	public void setPurchaseOrderSeqF(String purchaseOrderSeqF) {
		this.purchaseOrderSeqF = purchaseOrderSeqF;
	}
	
	
		
	
}