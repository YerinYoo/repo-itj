package com.itjfw.infra.orderdetail;

import java.sql.Date;

public class OrderDetailDto {
	
	private String orderDetailSeq;
	private Integer ordersCount;
	private String orderDeliverName;
	private String orderStatusCd;
	private String ordersSeqF;
	private String productSeqF;
	private String ordersSeq;
	private String ordererName;
	private Date ordersRegDate;
	private Date ordersModDate;
	private Integer ordersDelNy;
	private String productName;
	
	//order Detail getter, setter
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
	public String getOrderStatusCd() {
		return orderStatusCd;
	}
	public void setOrderStatusCd(String orderStatusCd) {
		this.orderStatusCd = orderStatusCd;
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
	public Date getOrdersRegDate() {
		return ordersRegDate;
	}
	public void setOrdersRegDate(Date ordersRegDate) {
		this.ordersRegDate = ordersRegDate;
	}
	public Date getOrdersModDate() {
		return ordersModDate;
	}
	public void setOrdersModDate(Date ordersModDate) {
		this.ordersModDate = ordersModDate;
	}
	public Integer getOrdersDelNy() {
		return ordersDelNy;
	}
	public void setOrdersDelNy(Integer ordersDelNy) {
		this.ordersDelNy = ordersDelNy;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	//order Detail toString()
	@Override
	public String toString() {
		return "OrderDetailDto [orderDetailSeq=" + orderDetailSeq + ", ordersCount=" + ordersCount
				+ ", orderDeliverName=" + orderDeliverName + ", orderStatusCd=" + orderStatusCd + ", ordersSeqF="
				+ ordersSeqF + ", productSeqF=" + productSeqF + ", ordersSeq=" + ordersSeq + ", ordererName="
				+ ordererName + ", ordersRegDate=" + ordersRegDate + ", ordersModDate=" + ordersModDate
				+ ", ordersDelNy=" + ordersDelNy + ", productName=" + productName + "]";
	}
	
	
}
