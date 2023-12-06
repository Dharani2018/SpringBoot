package com.dp.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customer")
public class Customer {
	
	//@Autowired
	//private Hotel hotel;
	
	@Value("12")
	private int custId;
	@Value("${cust.name}")
	private String custName;
	@Value("${cust.addrs}")
	private String custAddrs;
	
	@Value("#{hotel.idly+hotel.wada}")
	private Float totalBill;
	
	@Value("${path}")
	private String path;
	@Value("${os.name}")
	private String osName;
	
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddrs=" + custAddrs + ", totalBill="
				+ totalBill + ", path=" + path + ", osName=" + osName + "]";
	}
	
	

	
	
	 
	
	

}
