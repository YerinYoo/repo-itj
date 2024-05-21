package com.itjfw.infra.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itjfw.common.base.BaseController;
import com.itjfw.common.util.UtilSearch;
import com.itjfw.infra.member.MemberDto;
import com.itjfw.infra.member.MemberService;
import com.itjfw.infra.orderdetail.OrderDetailDto;
import com.itjfw.infra.orderdetail.OrderDetailService;

@Controller
public class OrdersController extends BaseController {
	
	@Autowired
	OrdersService ordersService;
	@Autowired
	MemberService memberService;
	@Autowired
	OrderDetailService orderDetailService;
	
	//회원 목록
	@RequestMapping(value = "/ordersXdmList")
	public String memberXdmList(@ModelAttribute("vo") OrdersVo ordersVo, Model model) throws Exception {

		UtilSearch.setSearch(ordersVo);
		
		ordersVo.setParamsPaging(ordersService.getTotalOrdersCount(ordersVo));
		
		if(ordersVo.getTotalRows() > 0) {
			
			model.addAttribute("list", ordersService.ordersList(ordersVo));
			

		}

		return "xdm/orders/ordersXdmList";
	}
	
	@RequestMapping(value="/ordersView")
	public String ordersView(OrdersDto ordersDto, Model model) throws Exception {
		
		model.addAttribute("item", ordersService.selectOrders(ordersDto));
		
		return "xdm/orders/ordersView";
	}
	
	@RequestMapping(value="/ordersInsertForm")
	public String ordersInsertForm(OrdersDto ordersDto, Model model) throws Exception{
		
		//주문 추가 페이지에서 멤버 리스트 셀렉트 박스로 받아오기
		model.addAttribute("listOfMember", memberService.selectListWithoutPaging());
	
		return "xdm/orders/ordersInsertForm";
	}
	
	@RequestMapping(value="/ordersUpdateForm")
	public String memberUpdateForm(OrdersDto ordersDto, Model model) throws Exception {
		
		model.addAttribute("item", ordersService.selectOrders(ordersDto));
		
		return "xdm/orders/ordersUpdateForm";
	}
	
// 메서드 컨트롤러
	@RequestMapping(value="/ordersInst")
	public String memberInst(OrdersDto  ordersDto) throws Exception {
		
		ordersService.ordersInst(ordersDto);
		
		return "redirect:/ordersXdmList";
	}
	
	@RequestMapping("/ordersUpdt")
	public String memberUpdt(OrdersDto ordersDto) throws Exception{
		ordersService.ordersUpdt(ordersDto);
		return "redirect:/ordersXdmList";
	}
	
	@RequestMapping("/ordersUlt")
	public String memberUlt(OrdersDto ordersDto) throws Exception {
		ordersService.ordersUlt(ordersDto);
		return "redirect:/ordersXdmList";
	}
	
	@RequestMapping(value = "/ordersMultiUele")
	public String codeMultiUele(OrdersDto dto) throws Exception{
		String[] checkboxSeqArray = dto.getCheckboxSeqArray();
		for(String checkboxSeq : checkboxSeqArray) {
			dto.setOrdersSeq(checkboxSeq);
			ordersService.ordersUlt(dto);
		}
		
		return "redirect:/codeXdmList";
	}
	
	@RequestMapping("/ordersDel")
	public String memberDel(OrdersDto ordersDto, OrderDetailDto orderDetailDto) throws Exception {
		
		orderDetailDto.setOrdersSeqF(ordersDto.getOrdersSeq());
		
		orderDetailService.delWithOrdersSeq(orderDetailDto);
		ordersService.ordersDel(ordersDto);
		
		return "redirect:/ordersXdmList";
	}
}
