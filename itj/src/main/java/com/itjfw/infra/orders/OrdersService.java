package com.itjfw.infra.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

	@Autowired
	OrdersDao ordersDao;
	
	public List<OrdersDto> ordersList(OrdersVo vo) {
		return ordersDao.ordersList();
	}
	
	public Integer getTotalOrdersCount(OrdersVo ordersVo) throws Exception {
		return ordersDao.getTotalOrdersCount(ordersVo);
	}
	
	public OrdersDto selectOrders(OrdersDto ordersDto) {
		return ordersDao.selectOrders(ordersDto);
	}
	
	public Integer ordersInst(OrdersDto ordersDto) {
		return ordersDao.ordersInst(ordersDto);
	}
	
	public Integer ordersUpdt(OrdersDto ordersDto) {
		return ordersDao.ordersUpdt(ordersDto);
	}
	
	public Integer ordersUlt(OrdersDto ordersDto) {
		return ordersDao.ordersUlt(ordersDto);
	}
	
	public Integer ordersDel(OrdersDto ordersDto) {
		return ordersDao.ordersDel(ordersDto);
	}
	
	public List<OrdersDto> selectListWithoutPaging() {
		return ordersDao.selectListWithoutPaging();
	}

}