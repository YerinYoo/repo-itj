package com.itjfw.infra.po;

import com.itjfw.common.base.BaseVo;

public class PoVo extends BaseVo {

	private String purchaseOrderSeq;
	private String purchaseOrderName;

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

}
