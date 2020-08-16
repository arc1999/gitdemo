package com.lti.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.javafx.beans.IDProperty;

@Entity
@Table(name = "TBL_CROP")

public class Crop {
	
	@Id
	private int id;
	
	private String name;
	private String crop_type;
	private String fertilizer_type;
	private int quantity;
	private int soil_pH;
	private LocalDate date_added_on;
	private int base_price;
	private String farmer_id;
	private String status;
	private LocalDate start_date;
	private LocalDate end_date;

	
	@ManyToOne
	@JoinColumn(name = "farmer_id")
	private User user;	
}
