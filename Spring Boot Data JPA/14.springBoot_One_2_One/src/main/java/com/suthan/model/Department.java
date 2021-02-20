package com.suthan.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="depat_tab")
public class Department {
	
	@Id
	private int did;
	
	private String dname;
	
	@OneToMany
	@JoinColumn(name="depid_fk")
	private List<Employee> empid;
	
}
