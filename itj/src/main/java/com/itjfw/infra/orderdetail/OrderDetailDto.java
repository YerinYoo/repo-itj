package com.itjfw.infra.orderdetail;

import java.sql.Date;

public class OrderDetailDto {
	
	//orderDetail Table Column
	private String orderDetailSeq;
	private Integer ordersCount;
	private String orderDeliverName;
	private Integer orderStatusCd;
	private Integer orderDetailDelNy;
	private Date orderDetailRegDate;
	private Date orderDetailModDate;
	private String ordersSeqF;
	private String productSeqF;
	
	//orders Table Column
	private String ordersSeq;
	private String ordererName;
	
	//product Table Column
	private String productSeq;
	private String productName;
	private Integer productPrice;
	
	//member Table Column
	private String memberSeq;
	private String memberID;
	private String memberName;
	private Integer memberTypeCd;
	
	// -----------------------------
	
	//getter, setter
	public String getOrderDetailSeq() {
		return orderDetailSeq;
	}
	public void setOrderDetailSeq(String orderDetailSeq) {
		this.orderDetailSeq = orderDetailSeq;
	}
	public Integer getOrdersCount() {
		return ordersCount;
	}
	public void setOrdersCount(Integer ordersCount) {
		this.ordersCount = ordersCount;
	}
	public String getOrderDeliverName() {
		return orderDeliverName;
	}
	public void setOrderDeliverName(String orderDeliverName) {
		this.orderDeliverName = orderDeliverName;
	}
	public Integer getOrderStatusCd() {
		return orderStatusCd;
	}
	public void setOrderStatusCd(Integer orderStatusCd) {
		this.orderStatusCd = orderStatusCd;
	}
	public Integer getOrderDetailDelNy() {
		return orderDetailDelNy;
	}
	public void setOrderDetailDelNy(Integer orderDetailDelNy) {
		this.orderDetailDelNy = orderDetailDelNy;
	}
	public Date getOrderDetailRegDate() {
		return orderDetailRegDate;
	}
	public void setOrderDetailRegDate(Date orderDetailRegDate) {
		this.orderDetailRegDate = orderDetailRegDate;
	}
	public Date getOrderDetailModDate() {
		return orderDetailModDate;
	}
	public void setOrderDetailModDate(Date orderDetailModDate) {
		this.orderDetailModDate = orderDetailModDate;
	}
	public String getOrdersSeqF() {
		return ordersSeqF;
	}
	public void setOrdersSeqF(String ordersSeqF) {
		this.ordersSeqF = ordersSeqF;
	}
	public String getProductSeqF() {
		return productSeqF;
	}
	public void setProductSeqF(String productSeqF) {
		this.productSeqF = productSeqF;
	}
	public String getOrdersSeq() {
		return ordersSeq;
	}
	public void setOrdersSeq(String ordersSeq) {
		this.ordersSeq = ordersSeq;
	}
	public String getOrdererName() {
		return ordererName;
	}
	public void setOrdererName(String ordererName) {
		this.ordererName = ordererName;
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
	public Integer getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
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
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public Integer getMemberTypeCd() {
		return memberTypeCd;
	}
	public void setMemberTypeCd(Integer memberTypeCd) {
		this.memberTypeCd = memberTypeCd;
	}
	
	//toString()
	@Override
	public String toString() {
		return "OrderDetailDto [orderDetailSeq=" + orderDetailSeq + ", ordersCount=" + ordersCount
				+ ", orderDeliverName=" + orderDeliverName + ", orderStatusCd=" + orderStatusCd + ", orderDetailDelNy="
				+ orderDetailDelNy + ", orderDetailRegDate=" + orderDetailRegDate + ", orderDetailModDate="
				+ orderDetailModDate + ", ordersSeqF=" + ordersSeqF + ", productSeqF=" + productSeqF + ", ordersSeq="
				+ ordersSeq + ", ordererName=" + ordererName + ", productSeq=" + productSeq + ", productName="
				+ productName + ", productPrice=" + productPrice + ", memberSeq=" + memberSeq + ", memberID=" + memberID
				+ ", memberName=" + memberName + ", memberTypeCd=" + memberTypeCd + "]";
	}
	

	
	
}
