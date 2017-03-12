package org.herman.mvctemplate.service;

import org.herman.mvctemplate.dto.JsonDto;
import org.springframework.stereotype.Service;

@Service
public class ServiceBean {
	public JsonDto genDto(){
		JsonDto dto=new JsonDto();
		dto.setId("1");
		dto.setName("Herman");
		return dto;
	}
}
