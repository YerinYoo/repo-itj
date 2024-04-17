package com.itjfw.infra.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	@Autowired
	ProductService productService;
	
	@RequestMapping(value = "/productXdmList")
	public String productXdmList(@ModelAttribute("vo") ProductVo vo, Model model) throws Exception{
		
//		UtilSearch.setSearch(vo);
//		
//		vo.setParamsPaging(productService.selectOneCount(vo));
//		
//		if(vo.getTotalRows() > 0) {
//			
//			model.addAttribute("list", productService.selectList(vo));
//		}
	
		return  "xdm/product/productXdmList";
	
	}
}
