package com.jpa.test.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Thing {
   
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "Thing_name")
	private String thingname;
	
	
	
	
	
}



