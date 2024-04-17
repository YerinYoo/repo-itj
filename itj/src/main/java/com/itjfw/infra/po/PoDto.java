package com.itjfw.infra.po;

import java.util.Date;

public class PoDto {
	private String purchaseOrderSeq;
	private String purchaseOrderName;
	private Integer purchaseOrderDelNy;
	private Date purchaseOrderRegDate;
	private Date purchaseOrderModDate;

	public String getPurchaseOrderSeq() {
		return purchaseOrderSeq;
	}

	public void setPurchaseOrderSeq(String purchaseOrderSeq) {
		this.purchaseOrderSeq = purchaseOrderSeq;
	}

	public String getPurchaseOrderName() {
		return purchaseOrderName;
	}

	public void setPurchaseOrderName(String purchaseOrderName) {
		this.purchaseOrderName = purchaseOrderName;
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

}
