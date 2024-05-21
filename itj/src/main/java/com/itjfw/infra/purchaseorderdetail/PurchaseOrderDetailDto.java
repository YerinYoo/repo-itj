package com.itjfw.infra.purchaseorderdetail;

import java.util.Date;

public class PurchaseOrderDetailDto {

	private String purchaseOrderDetailSeq;
	private Integer purchaseOrderDetailDelNy;
	private Integer purchaseCount;
	private String purchaseDeliverName;
	private Integer purchaseStatusCd;
	private Date purchaseOrderDetailRegDate;
	private Date purchaseOrderDetailModDate;
	private String productSeqF;
	private String purchaseSeqF;
	private String productSeq;
	private String productName;
	private String purchaseOrderSeq;
	
	private String[] checkboxSeqArray  = null;
	
	
	public String[] getCheckboxSeqArray() {
		return checkboxSeqArray;
	}
	public void setCheckboxSeqArray(String[] checkboxSeqArray) {
		this.checkboxSeqArray = checkboxSeqArray;
	}
	public String getPurchaseOrderDetailSeq() {
		return purchaseOrderDetailSeq;
	}
	public void setPurchaseOrderDetailSeq(String purchaseOrderDetailSeq) {
		this.purchaseOrderDetailSeq = purchaseOrderDetailSeq;
	}
	public Integer getPurchaseOrderDetailDelNy() {
		return purchaseOrderDetailDelNy;
	}
	public void setPurchaseOrderDetailDelNy(Integer purchaseOrderDetailDelNy) {
		this.purchaseOrderDetailDelNy = purchaseOrderDetailDelNy;
	}
	public Integer getPurchaseCount() {
		return purchaseCount;
	}
	public void setPurchaseCount(Integer purchaseCount) {
		this.purchaseCount = purchaseCount;
	}
	public String getPurchaseDeliverName() {
		return purchaseDeliverName;
	}
	public void setPurchaseDeliverName(String purchaseDeliverName) {
		this.purchaseDeliverName = purchaseDeliverName;
	}
	public Integer getPurchaseStatusCd() {
		return purchaseStatusCd;
	}
	public void setPurchaseStatusCd(Integer purchaseStatusCd) {
		this.purchaseStatusCd = purchaseStatusCd;
	}
	public Date getPurchaseOrderDetailRegDate() {
		return purchaseOrderDetailRegDate;
	}
	public void setPurchaseOrderDetailRegDate(Date purchaseOrderDetailRegDate) {
		this.purchaseOrderDetailRegDate = purchaseOrderDetailRegDate;
	}
	public Date getPurchaseOrderDetailModDate() {
		return purchaseOrderDetailModDate;
	}
	public void setPurchaseOrderDetailModDate(Date purchaseOrderDetailModDate) {
		this.purchaseOrderDetailModDate = purchaseOrderDetailModDate;
	}
	public String getProductSeqF() {
		return productSeqF;
	}
	public void setProductSeqF(String productSeqF) {
		this.productSeqF = productSeqF;
	}
	public String getPurchaseSeqF() {
		return purchaseSeqF;
	}
	public void setPurchaseSeqF(String purchaseSeqF) {
		this.purchaseSeqF = purchaseSeqF;
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
	public String getPurchaseOrderSeq() {
		return purchaseOrderSeq;
	}
	public void setPurchaseOrderSeq(String purchaseSeq) {
		this.purchaseOrderSeq = purchaseSeq;
	}
	
	
}