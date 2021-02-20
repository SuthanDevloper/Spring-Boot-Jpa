package com.suthan.model;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="students")
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private Integer stdId;
	private String stdCode;
	private Double stdFee;
	
	@ElementCollection
	@CollectionTable(
			name="std_subj",
			joinColumns =@JoinColumn(name="sid")
			
			)
	@OrderColumn(name="pos")
	@Column(name="subjects") // element column
	private List<String> subj;
	
	
	
	@ElementCollection
	@CollectionTable(
			name="std_labs",
			joinColumns =@JoinColumn(name="sid")
			
			)
	@Column(name="labs") // element column
	private Set<String> labs;
	
	
	
	@CollectionTable(
			name="std_marks",
			joinColumns =@JoinColumn(name="sid")
			
			)
	@Column(name="grades") // element column
	@MapKeyColumn(name="code")
	@ElementCollection
	private Map<String, String > grades;

}
