package com.itjfw.infra.orderdetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itjfw.common.base.BaseController;
import com.itjfw.common.util.UtilSearch;
import com.itjfw.infra.orders.OrdersService;


@Controller
public class OrderDetailController extends BaseController{
	
	@Autowired
	OrderDetailService orderDetailService;
	@Autowired
	OrdersService ordersService;
	
	//주문 상세 리스트
	@RequestMapping(value="/orderDetailXdmList")
	public String orderDetailXdmList(@ModelAttribute("vo") OrderDetailVo orderDetailVo, Model model) throws Exception {
		
		UtilSearch.setSearch(orderDetailVo);
		
		orderDetailVo.setParamsPaging(orderDetailService.getTotalOrderDetailCount(orderDetailVo));
		
		if (orderDetailVo.getTotalRows() > 0) {
			
			model.addAttribute("list", orderDetailService.orderDetailList(orderDetailVo));
		}
		
		return "xdm/orderdetail/orderDetailXdmList";
	}
	
	//주문 상세 셀렉원
	@RequestMapping(value="/orderDetailView")
	public String orderDetailView(OrderDetailDto orderDetailDto, Model model) throws Exception {
		
		model.addAttribute("item", orderDetailService.selectOrderDetail(orderDetailDto));
		
		return "xdm/orderdetail/orderDetailView";
	}
	
	//주문 상세 인서트
	@RequestMapping(value="/orderDetailInsertForm")
	public String orderDetailInsertForm(OrderDetailDto orderDetailDto, Model model) throws Exception {
		
		//주문 상세 페이지에서 주문 리스트 셀렉트 박스로 받아오기
		model.addAttribute("ListOfOrders", ordersService.selectListWithoutPaging());
		//주문 상세 페이지에서 상품 리스트 셀렉트 박스로 받아오기
		
		
		return "xdm/orderdetail/orderDetailInsertForm";
	}

}
