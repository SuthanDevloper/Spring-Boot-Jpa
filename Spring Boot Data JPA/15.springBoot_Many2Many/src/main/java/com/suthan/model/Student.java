package com.suthan.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student_tab")
public class Student {
	
	@Id
	private int sid;
	
	private String sname;
	
	@ManyToMany
	@JoinTable(
			name="stu_course",
			joinColumns = @JoinColumn(name="sid_fk"),
			inverseJoinColumns = @JoinColumn(name="cou_fk"))
	private List<Course> cssub;

}
