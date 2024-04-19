package com.itjfw.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.itjfw.common.base.BaseController;
import com.itjfw.common.util.UtilSearch;

@Controller
public class MemberController extends BaseController {
	
	@Autowired
	MemberService memberService;
	
	//회원 목록
	@RequestMapping(value = "/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo") MemberVo memberVo, Model model) throws Exception {

		UtilSearch.setSearch(memberVo);
		
		memberVo.setParamsPaging(memberService.getTotalMemberCount(memberVo));
		
		if(memberVo.getTotalRows() > 0) {
			
			model.addAttribute("list", memberService.memberList(memberVo));

		}

		return "xdm/member/memberXdmList";
	}
	
	@RequestMapping(value="/memberView")
	public String memberView(MemberDto memberDto, Model model) throws Exception {
		
		model.addAttribute("item", memberService.selectMember(memberDto));
		
		return "xdm/member/memberView";
	}
	
	@RequestMapping(value="/memberInsertForm")
	public String memberInsertForm() throws Exception{
	
		return "xdm/member/memberInsertForm";
	}
	
	@RequestMapping(value="/memberUpdateForm")
	public String memberUpdateForm(MemberDto memberDto, Model model) throws Exception {
		
		model.addAttribute("item", memberService.selectMember(memberDto));
		
		return "xdm/member/memberUpdateForm";
	}
	
// 메서드 컨트롤러
	@RequestMapping(value="/memberInst")
	public String memberInst(MemberDto  memberDto) throws Exception {
		
		memberService.memberInst(memberDto);
		
		return "redirect:/memberXdmList";
	}
	
	@RequestMapping("/memberUpdt")
	public String memberUpdt(MemberDto memberDto) throws Exception{
		memberService.memberUpdt(memberDto);
		return "redirect:/memberView";
	}
	
	@RequestMapping("/memberUlt")
	public String memberUlt(MemberDto memberDto) throws Exception {
		memberService.memberUlt(memberDto);
		return "redirect:/memberXdmList";
	}
	
	@RequestMapping("/memberDel")
	public String memberDe(MemberDto memberDto) throws Exception {
		memberService.memberDel(memberDto);
		return "redirect:/memberXdmList";
	}
}
