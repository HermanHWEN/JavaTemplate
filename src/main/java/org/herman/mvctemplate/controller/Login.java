package org.herman.mvctemplate.controller;


import org.herman.mvctemplate.dto.JsonDto;
import org.herman.mvctemplate.service.ServiceBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
	@Autowired
	private ServiceBean serProv;
	
	@RequestMapping(value="/login")
	public String hello(){
		return "Hello";
	}
	
	@RequestMapping(value="/json")
	public @ResponseBody JsonDto json(){
		
		return serProv.genDto();
	}
}
