package com.itjfw.infra.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.itjfw.common.base.BaseController;

@Controller
public class OrdersController extends BaseController {

	@Autowired
	OrdersService ordersService;

}
