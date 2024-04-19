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