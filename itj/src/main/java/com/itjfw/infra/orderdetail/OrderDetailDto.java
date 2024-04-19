package com.itjfw.infra.orderdetail;

public class OrderDetailDto {
	
	private String orderDetailSeq;
	private Integer ordersCount;
	private String orderDeliverName;
	private String orderStatusCd;
	private String ordersSeqF;
	private String productSeqF;
	
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
	
	//order Detail toString()
	@Override
	public String toString() {
		return "OrderDetailDto [orderDetailSeq=" + orderDetailSeq + ", ordersCount=" + ordersCount
				+ ", orderDeliverName=" + orderDeliverName + ", orderStatusCd=" + orderStatusCd + ", ordersSeqF="
				+ ordersSeqF + ", productSeqF=" + productSeqF + "]";
	}
	
}
