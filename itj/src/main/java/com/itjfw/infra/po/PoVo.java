package com.itjfw.infra.po;

import com.itjfw.common.base.BaseVo;

public class PoVo extends BaseVo {

	private String purchaseOrderSeq;
	private String memberSeqF;
	private String purchaseOrderMemo;
	private Integer productCount;
	private String productSeqF;
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

	

	

}
