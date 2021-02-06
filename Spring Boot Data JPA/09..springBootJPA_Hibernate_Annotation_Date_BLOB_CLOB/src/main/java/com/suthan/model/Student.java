package com.suthan.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
	
//	@Temporal(TemporalType.DATE)
//	private Date dataA;
//	
//	@Temporal(TemporalType.TIME)
//	private Date dateB;
//	
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date dateC;
	
	@Lob
	private byte[] stdImg;
	
	@Lob
	private char[] stddesc;

}
