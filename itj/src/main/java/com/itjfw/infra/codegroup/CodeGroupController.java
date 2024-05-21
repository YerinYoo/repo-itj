package com.itjfw.infra.codegroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itjfw.common.base.BaseController;
import com.itjfw.common.util.UtilSearch;

@Controller
public class CodeGroupController extends BaseController {
	private String codeGroupUrl = "xdm/cdg/";

	@Autowired
	CodeGroupService codeGroupService;

	@RequestMapping(value = "/codeGroupXdmList")
	public String codeGroupXdmList(@ModelAttribute("vo") CodeGroupVo vo, Model model) throws Exception {
		UtilSearch.setSearch(vo);

		vo.setParamsPaging(codeGroupService.selectCount(vo));

		if (vo.getTotalRows() > 0) {
			model.addAttribute("list", codeGroupService.selectListWithPaging(vo));
		}

		return codeGroupUrl + "codeGroupXdmList";
	}

	@RequestMapping(value = "/codeGroupView")
	public String codeGroupView(CodeGroupDto dto, Model model) throws Exception {

		model.addAttribute("item", codeGroupService.selectOne(dto));

		return codeGroupUrl + "codeGroupView";
	}

	@RequestMapping(value = "/codeGroupUpdateForm")
	public String codeGroupUpdateForm(Model model, CodeGroupDto dto) throws Exception {

		model.addAttribute("item", codeGroupService.selectOne(dto));
		return codeGroupUrl + "codeGroupUpdateForm";
	}

	@RequestMapping(value = "/codeGroupInsertForm")
	public String codeGroupInsertForm(Model model) throws Exception {
		model.addAttribute("codeGroupGroupList", codeGroupService.selectListWithoutPaging());
		return codeGroupUrl + "codeGroupInsertForm";
	}

	@RequestMapping(value = "/codeGroupInsert")
	public String codeGroupInsert(CodeGroupDto dto, Model model) throws Exception {
		System.out.println("==================================================");
		codeGroupService.insert(dto);
		return "redirect:/codeGroupXdmList";
	}

	@RequestMapping(value = "/codeGroupUpdt")
	public String codeGroupUpdt(CodeGroupDto dto, Model model) throws Exception {

		codeGroupService.update(dto);
		return "redirect:/codeGroupXdmList";
	}

	@RequestMapping(value = "/codeGroupUelete")
	public String codeGroupUelete(CodeGroupDto dto, Model model) throws Exception {

		codeGroupService.uelete(dto);
		return "redirect:/codeGroupXdmList";
	}
	
	@RequestMapping(value = "/codeGroupMultiUele")
	public String codeGroupMultiUele(CodeGroupDto dto) throws Exception{
		String[] checkboxSeqArray = dto.getCheckboxSeqArray();
		for(String checkboxSeq : checkboxSeqArray) {
			dto.setCodeGroupSeq(checkboxSeq);
			codeGroupService.uelete(dto);
		}
		
		return "redirect:/codeGroupXdmList";
	}

	@RequestMapping(value = "/codeGroupDelete")
	public String codeGroupDelete(CodeGroupDto dto, Model model) throws Exception {

		codeGroupService.delete(dto);
		return "redirect:/codeGroupXdmList";
	}

}
