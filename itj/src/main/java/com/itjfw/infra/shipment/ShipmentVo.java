package com.itjfw.infra.shipment;

import com.itjfw.common.base.BaseVo;

public class ShipmentVo extends BaseVo {

	private String shipmentSeq;
	private Integer shipmentCount;
	private String shipmentDeliverName;

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

	public String getShipmentDeliverName() {
		return shipmentDeliverName;
	}

	public void setShipmentDeliverName(String shipmentDeliverName) {
		this.shipmentDeliverName = shipmentDeliverName;
	}

}
