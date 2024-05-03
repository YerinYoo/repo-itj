package com.itjfw.infra.receipt;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itjfw.common.util.UtilSearch;
import com.itjfw.infra.po.PoDto;
import com.itjfw.infra.po.PoService;
import com.itjfw.infra.product.ProductService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ReceiptController {

	@Autowired
	ReceiptService receiptService;
	
	@Autowired
	PoService poService;
	
	@Autowired
	ProductService productService;
	
	// 리스트 페이지
	@RequestMapping(value = "/receiptXdmList")
	public String receiptXdmList(@ModelAttribute("vo")ReceiptVo receiptVo, Model model) throws Exception{
		
		UtilSearch.setSearch(receiptVo);
		
		receiptVo.setParamsPaging(receiptService.selectOneCount(receiptVo));
		
		if(receiptVo.getTotalRows() > 0) {
			
			model.addAttribute("list", receiptService.selectListWithPaging(receiptVo));
		}
	
		return  "xdm/receipt/receiptXdmList";
	
	}
	
	// 리스트 페이지 셀렉문 아작스
		@ResponseBody
		@RequestMapping(value = "purchaseorderSelectCheck")
		public Map<String, Object> purchaseorderSelectCheck(ReceiptDto dto,PoDto pdto, Model model, HttpSession httpSession) throws Exception {
			
			Map<String, Object> returnMap = new HashMap<String, Object>();
			
			pdto.setPurchaseOrderSeq(dto.getPurchaseOrderSeqF());
			
			if(pdto.getPurchaseOrderSeq() != null) {
					        
		        // returnMap에도 성공 여부와 함께 데이터를 담아 전달
		        returnMap.put("rt", "success");
		        returnMap.put("itemPO", poService.selectOne(pdto));
				
			} else {
				returnMap.put("rt", "fail");
			}
			return returnMap;
		}
	
	// uelete
	@RequestMapping(value = "/receiptXdmUelete")
	public String receiptXdmUelete(ReceiptDto receiptDto) throws Exception{
		
		receiptService.updateDelete(receiptDto);
	
		return "redirect:/receiptXdmList";
	
	}
	
	// delete
	@RequestMapping(value = "/receiptXdmDelete")
	public String receiptXdmDelete(ReceiptDto receiptDto) throws Exception{
		
		receiptService.delete(receiptDto);
	
		return "redirect:/receiptXdmList";
	
	}
	
	// insert
	@RequestMapping(value = "/receiptXdmInsert")
	public String receiptXdmInsert(ReceiptDto receiptDto) throws Exception{
		
		receiptService.insert(receiptDto);
	
		return "redirect:/receiptXdmList";
	
	}
	
	
	// update
	@RequestMapping(value = "/receiptXdmUpdate")
	public String receiptXdmUpdate(ReceiptDto receiptDto) throws Exception{
		
		receiptService.update(receiptDto);
	
		return "redirect:/receiptXdmList";
	
	}
	
	// 상품 상세 정보
	@RequestMapping(value = "/receiptXdmView")
	public String receiptXdmView(ReceiptDto receiptDto, Model model) throws Exception{
		
		model.addAttribute("item", receiptService.selectOne(receiptDto));
		
		return  "xdm/receipt/receiptXdmView";
	
	}
	
	// 상품 등록
	@RequestMapping(value = "/receiptXdmInsertForm")
	public String receiptXdmInsertForm() throws Exception{
		
		
		return  "xdm/receipt/receiptXdmInsertForm";
	
	}
	
	// 상품 수정
	@RequestMapping(value = "/receiptXdmUpdateForm")
	public String receiptXdmUpdateForm(ReceiptDto receiptDto, Model model) throws Exception{
		
		model.addAttribute("item", receiptService.selectOne(receiptDto));
		
		return  "xdm/receipt/receiptXdmUpdateForm";
	
	}
	
}
