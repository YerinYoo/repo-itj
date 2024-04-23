package com.itjfw.infra.member;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itjfw.common.base.BaseController;
import com.itjfw.common.constants.Constants;
import com.itjfw.common.util.UtilSearch;
import com.recorded.infra.member.MemberDto;

import jakarta.servlet.http.HttpSession;

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
		String originalPwd = memberDto.getMemberID();
		
		//사용자가 입력한 비밀번호를 암호화하여 DTO 객체에 설정
		memberDto.setMemberPwd(encodeBcrypt(memberDto.getMemberPwd(), 9));
		
		//입력 값이 없으면 0으로 설정
		if (memberDto.getMemberDelNy() == null) {
			memberDto.setMemberDelNy(0);
		}
		
		//데이터베이스에 인서트 하기 전 암호화된 비밀번호를 확인하고 출력
		System.out.println("Encrypted Password : " + memberDto.getMemberPwd());
		
		//사용자가 입력한 비밀번호와 암호화된 비밀번호를 비교하여 출력 
		if (matchesBcrypt(originalPwd, memberDto.getMemberPwd(), 10)) {
			System.out.println("Password Matches!");
		} else {
			System.out.println("Password Doesn't Maatch!");
		
		memberService.memberInst(memberDto);
		
		return "redirect:/memberXdmList";
		}
	}
	

	
	@RequestMapping("/memberUpdt")
	public String memberUpdt(MemberDto memberDto) throws Exception{
		memberService.memberUpdt(memberDto);
		return "redirect:/memberXdmList";
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
	
//로그인 처리 
    @ResponseBody
    @RequestMapping(value = "loginAdmPg")
    public Map<String, Object> loginAdmPg(MemberDto dto, HttpSession httpSession) throws Exception {
        Map<String, Object> returnMap = new HashMap<>();

        // 입력된 아이디와 비밀번호를 서비스 레이어로 전달하여 인증 수행
        MemberDto authenticatedMember = memberService.authenticate(dto.getMemberID(), dto.getMemberPwd());

        // 인증된 회원이 존재하면 세션에 회원 정보 저장하고 성공 메시지 반환
        if (authenticatedMember != null) {
            // 로그인 성공 시 세션에 회원 정보 저장
            httpSession.setAttribute("authenticatedMember", authenticatedMember);
            httpSession.setMaxInactiveInterval(60 * Constants.SESSION_MINUTE_XDM); // 60초 * 30분 = 30분
            httpSession.setAttribute("sessSeqXdm", authenticatedMember.getMemberSeq());
            httpSession.setAttribute("sessIdXdm", authenticatedMember.getMemberID());
            httpSession.setAttribute("sessNameXdm", authenticatedMember.getMemberName());
            
			System.out.println("---------------------");
			System.out.println("httpSession.getAttribute(\"sessNameXdm\"): " + httpSession.getAttribute("sessNameXdm"));
			System.out.println("---------------------");

            returnMap.put("rt", "success");
        } else {
            // 인증 실패 시 처리
            returnMap.put("rt", "fail");
        }

        return returnMap;
    }
}
