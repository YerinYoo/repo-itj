package com.itjfw.infra.orders;

import java.util.List;

public interface OrdersDao {

	//주문 전체 리스트
	public List<OrdersDto> ordersList(OrdersVo vo);
	
	//일정 주문 셀렉원
	public OrdersDto selectOrders(OrdersDto ordersDto);
	
	//주문 총 카운트 반환
	public Integer getTotalOrdersCount(OrdersVo ordersVo);
	
	// ----------------------
	
	public Integer ordersInst(OrdersDto ordersDto);
	
	public Integer ordersUpdt(OrdersDto ordersDto);

	public Integer ordersUlt(OrdersDto ordersDto);
	
	public Integer ordersDel(OrdersDto ordersDto);
	
	//주문 상세 페이지에서 주문 정보 불러오기
	public List<OrdersDto> selectListWithoutPaging();
}

