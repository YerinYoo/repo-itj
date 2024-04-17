package com.itjfw.infra.shipment;

import java.util.Date;

public class ShipmentDto {
	private String shipmentSeq;
	private Integer shipmentCount;
	private Integer shipmentStatusCd;
	private String shipmentDeliverName;
	private Integer shipmentDelNy;
	private Date shipmentRegDate;
	private Date shipmentModDate;

	public String getShipmentSeq() {
		return shipmentSeq;
	}

	public void setShipmentSeq(String shipmentSeq) {
		this.shipmentSeq = shipmentSeq;
	}

	public Integer getShipmentCount() {
		return shipmentCount;
	}

	public void setShipmentCount(Integer shipmentCount) {
		this.shipmentCount = shipmentCount;
	}

	public Integer getShipmentStatusCd() {
		return shipmentStatusCd;
	}

	public void setShipmentStatusCd(Integer shipmentStatusCd) {
		this.shipmentStatusCd = shipmentStatusCd;
	}

	public String getShipmentDeliverName() {
		return shipmentDeliverName;
	}

	public void setShipmentDeliverName(String shipmentDeliverName) {
		this.shipmentDeliverName = shipmentDeliverName;
	}

	public Integer getShipmentDelNy() {
		return shipmentDelNy;
	}

	public void setShipmentDelNy(Integer shipmentDelNy) {
		this.shipmentDelNy = shipmentDelNy;
	}

	public Date getShipmentRegDate() {
		return shipmentRegDate;
	}

	public void setShipmentRegDate(Date shipmentRegDate) {
		this.shipmentRegDate = shipmentRegDate;
	}

	public Date getShipmentModDate() {
		return shipmentModDate;
	}

	public void setShipmentModDate(Date shipmentModDate) {
		this.shipmentModDate = shipmentModDate;
	}

}
