package com.jpa.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import org.springframework.cglib.beans.BeanCopier.Generator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="Emp_table11")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Employee {

	@Id
	@GeneratedValue(generator="mygen",strategy=GenerationType.AUTO)
	private Integer empId;

	@Column(name = "emp_name")
	private String empName;

	private int empSal;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="id")
	private List<Addres> addres;
	
	
	@ElementCollection
	@CollectionTable(name="departments_tab",joinColumns=@JoinColumn(referencedColumnName="empId"))
	@OrderColumn(name="empid")
	@Column(name="dept")
	private List<String> departments;

}
