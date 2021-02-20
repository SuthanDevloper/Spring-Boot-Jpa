package com.suthan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="course_tab")
public class Course {
	
	@Id
	private int cid;
	private String cname;
	private double fees;
	

}
