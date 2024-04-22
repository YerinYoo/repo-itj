package com.itjfw.infra.orderdetail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {
	
	@Autowired
	OrderDetailDao orderDetailDao;
	
	public List<OrderDetailDto> orderDetailList(OrderDetailVo vo) {
		return orderDetailDao.orderDetailList(vo);
	}
	
	public OrderDetailDto selectOrderDetail(OrderDetailDto orderDetailDto) {
		return orderDetailDao.selectOrderDetail(orderDetailDto);
	}
	
	public Integer getTotalOrderDetailCount(OrderDetailVo orderDetailVo) throws Exception {
		return orderDetailDao.getTotalOrderDetailCount(orderDetailVo);
	}
	
	public Integer orderDetailInsert(OrderDetailDto orderDetailDto) {
		return orderDetailDao.orderDetailInst(orderDetailDto);
	}
	
	public Integer orderDetailUpdt(OrderDetailDto orderDetailDto) {
		return orderDetailDao.orderDetailUpdt(orderDetailDto);
	}
	
	public Integer orderDetailUlt (OrderDetailDto orderDetailDto) {
		return orderDetailDao.orderDetailUlt(orderDetailDto);
	}
	
	public Integer orderDetailDel (OrderDetailDto orderDetailDto) {
		return orderDetailDao.orderDetailDel(orderDetailDto);
	}
}
