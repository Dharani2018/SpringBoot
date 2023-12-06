package com.dp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component("hotel")
public class Hotel {
	
	@Value("${menu.idly}")
	private Integer idly;
	@Value("${menu.wada}")
	private Integer wada;
	@Value("${menu.poha}")
	private Integer poha;
	@Value("${menu.dosa}")
	private Integer dosa;
	

	

}
