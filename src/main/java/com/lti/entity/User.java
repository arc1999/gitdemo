package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
public class User {
	@Id
	private int id;

	private String firstname;
	private String lastname;
	private String username;
	private String password;
	private String pancard;
	private String email;

}
