package com.jpa.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Addres {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	private String city;
	
	private String county;

}
