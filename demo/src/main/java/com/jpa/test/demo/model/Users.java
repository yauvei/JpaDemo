package com.jpa.test.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Users {
   
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "team_name")
    private String teamName;
	@Column(name = "salary")
	private Integer salary;
	
	
	
	
}



