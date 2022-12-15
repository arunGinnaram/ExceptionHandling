package com.arun.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

//import org.apache.tomcat.jni.Address;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity 
@Data
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO,generator="add")
	@SequenceGenerator(name="add",sequenceName = "addSeq")
	private Integer addid; 
	
	private String city;
	
	private String pin;
	 	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@CreationTimestamp
	private LocalDate createddate;
	
	

}
