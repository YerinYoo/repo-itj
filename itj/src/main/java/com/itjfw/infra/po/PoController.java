package com.itjfw.infra.po;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.itjfw.common.base.BaseController;
import com.itjfw.infra.code.CodeService;
import com.itjfw.infra.codegroup.CodeGroupService;

@Controller
public class PoController extends BaseController {

	@Autowired
	CodeService codeService;
	@Autowired
	PoService poService;
	
	

}
