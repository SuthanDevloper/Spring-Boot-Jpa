package com.suthan.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prod_tab")
public class Product {
	
	@Id
	private int pid;
	
	private String pname;
	
	private int qty;
	
	@ManyToOne
	@JoinColumn(name="vid_fk")
	private Vendor vob;
	
}
