package com.itjfw.infra.shipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itjfw.common.base.BaseController;
import com.itjfw.common.util.UtilSearch;
import com.itjfw.infra.code.CodeService;

@Controller
public class ShipmentController extends BaseController {
	private String shipmentUrl = "xdm/shipment/";
	
	@Autowired
	CodeService codeService;
	@Autowired
	ShipmentService shipmentService;
	
	@RequestMapping(value = "/shipmentXdmList")
	public String shipmentXdmList(@ModelAttribute("vo") ShipmentVo vo, Model model) throws Exception {
		UtilSearch.setSearch(vo);

		vo.setParamsPaging(shipmentService.selectCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", shipmentService.selectListWithPaging(vo));
		}

		return shipmentUrl + "shipmentXdmList";
	}

	@RequestMapping(value = "/shipmentView")
	public String shipmentView(ShipmentDto dto, Model model) throws Exception {

		model.addAttribute("item", shipmentService.selectOne(dto));

		return shipmentUrl + "shipmentView";
	}

	@RequestMapping(value = "/shipmentUpdateForm")
	public String shipmentUpdateForm(Model model, ShipmentDto dto) throws Exception {
		model.addAttribute("shipmentGroupList", shipmentService.selectListWithoutPaging());
		model.addAttribute("item", shipmentService.selectOne(dto));
		return shipmentUrl + "shipmentUpdateForm";
	}

	@RequestMapping(value = "/shipmentInsertForm")
	public String shipmentInsertForm(Model model) throws Exception {
		model.addAttribute("shipmentGroupList", shipmentService.selectListWithoutPaging());
		return shipmentUrl + "shipmentInsertForm";
	}

	@RequestMapping(value = "/shipmentInsert")
	public String shipmentInsert(ShipmentDto dto, Model model) throws Exception {
		shipmentService.insert(dto);
		return "redirect:/shipmentXdmList";
	}

	@RequestMapping(value = "/shipmentUpdt")
	public String shipmentUpdt(ShipmentDto dto, Model model) throws Exception {

		shipmentService.update(dto);
		return "redirect:/shipmentXdmList";
	}

	@RequestMapping(value = "/shipmentUelete")
	public String shipmentUelete(ShipmentDto dto, Model model) throws Exception {

		shipmentService.uelete(dto);
		return "redirect:/shipmentXdmList";
	}
	
	// multiuelete
	@RequestMapping(value = "/shipmentMultiUele")
	public String productMultiUele(ShipmentDto dto) throws Exception{
		String[] checkboxSeqArray = dto.getCheckboxSeqArray();
		for(String checkboxSeq : checkboxSeqArray) {
			dto.setShipmentSeq(checkboxSeq);
			shipmentService.uelete(dto);
		}
		
		return "redirect:/shipmentXdmList";
	}

	@RequestMapping(value = "/shipmentDelete")
	public String shipmentDelete(ShipmentDto dto, Model model) throws Exception {

		shipmentService.delete(dto);
		return "redirect:/shipmentXdmList";
	}
	

}
