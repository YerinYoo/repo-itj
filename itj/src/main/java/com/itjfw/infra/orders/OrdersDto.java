package com.itjfw.infra.orders;

import java.util.Date;

public class OrdersDto {
	
	private String ordersSeq;
	private String ordererName;
	private String ordersDelNy;
	private Date ordersRegDate;
	private Date ordersModDate;
	private String memberSeqF;
	
	//orders DTO getter, setter
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
	public String getOrdersDelNy() {
		return ordersDelNy;
	}
	public void setOrdersDelNy(String ordersDelNy) {
		this.ordersDelNy = ordersDelNy;
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
	public String getMemberSeqF() {
		return memberSeqF;
	}
	public void setMemberSeqF(String memberSeqF) {
		this.memberSeqF = memberSeqF;
	}
	
	//orders toString()
	@Override
	public String toString() {
		return "OrdersDto [ordersSeq=" + ordersSeq + ", ordererName=" + ordererName + ", ordersDelNy=" + ordersDelNy
				+ ", ordersRegDate=" + ordersRegDate + ", ordersModDate=" + ordersModDate + ", memberSeqF=" + memberSeqF
				+ "]";
	}
	
	
	
	
	
	
}
