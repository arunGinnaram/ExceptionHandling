package com.arun.helper;

import java.time.LocalDateTime;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.annotation.JsonFormat;
 
//may be no need of below next 2 lines
//@ConfigurationProperties(prefix = "rest.api.response")
//@PropertySource(value = "classpath:application.yml")
public class ResponseAPI {
	
	public String status;
	public String message;
	public Object data;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy", locale = "hi_IN", timezone = "IST")
	private LocalDateTime timeStamp;

	private ResponseAPI() {
		timeStamp = LocalDateTime.now();
	}

	 
	public ResponseAPI(String status) {
		this();
		this.status = status;
	}
	
	public ResponseAPI(String status,String messsage) {
		this();
		this.status =status;
		this.message = messsage;		
	}
	
	 
	public ResponseAPI(String status,String message,Object data) {
		this();
		this.status=status;
		this.message = message;
		this.data = data;
	}
}
 

