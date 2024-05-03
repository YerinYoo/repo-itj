package com.itjfw.infra.po;

import java.util.Date;

public class PoDto {
	private String purchaseOrderSeq;
	private Integer purchaseOrderDelNy;
	private Date purchaseOrderRegDate;
	private Date purchaseOrderModDate;
	private String purchaseOrderMemo;
	private String memberSeqF;
	private String ProductSeqF;
	private Integer productCount;

	private String xProductName;

	private String xMemberName;
	private String productSeq;
	private String productName;
	private Double productPrice;
	
	

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

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

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

	public String getxProductName() {
		return xProductName;
	}

	public void setxProductName(String xProductName) {
		this.xProductName = xProductName;
	}

	public String getProductSeqF() {
		return ProductSeqF;
	}

	public void setProductSeqF(String productSeqF) {
		ProductSeqF = productSeqF;
	}

	public Integer getProductCount() {
		return productCount;
	}

	public void setProductCount(Integer productCount) {
		this.productCount = productCount;
	}
	
	
}
