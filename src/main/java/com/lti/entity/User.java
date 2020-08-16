package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
public class User {
	@Id
	private int id;
 
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	
	
	
}
