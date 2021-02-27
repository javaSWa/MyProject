package com.swa;

import org.springframework.beans.factory.annotation.Value;

public class Address {
    
	@Value("${Address.city}")
	String city;
	
}
