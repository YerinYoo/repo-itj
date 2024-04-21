package com.itjfw.infra.orderdetail;

import java.util.List;

public interface OrderDetailDao { 
	
	//주문 상세 전체 리스트
	public List<OrderDetailDto> orderDetailList();
	
	//특정 주문 상세 셀렉원
	public OrderDetailDto selectOrderDetail(OrderDetailDto orderDetailDto);
	
	//주문 상세 총 카운트 반환
	public Integer getTotalOrderDetailCount(OrderDetailVo orderDetailVo);
	
	//---------------------
	
	public Integer orderDetailInst(OrderDetailDto orderDetailDto);
	
	public Integer orderDetailUpdt(OrderDetailDto orderDetailDto);
	
	public Integer orderDetailUlt (OrderDetailDto orderDetailDto);
	
	public Integer orderDetailDel (OrderDetailDto orderDetailDto);

}
