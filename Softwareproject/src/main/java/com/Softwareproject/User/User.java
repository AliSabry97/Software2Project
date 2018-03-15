package com.Softwareproject.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String f_name;
	private String password;
	private String mail;
	private String phone;
	private String username;
	private String signin_password;
	private String type_of_user;
	public User()
	{
		
	}
	public User(Integer id, String f_name, String password, String mail, String phone, String username,
			String signin_password, String type_of_user) {
		super();
		this.id = id;
		this.f_name = f_name;
		this.password = password;
		this.mail = mail;
		this.phone = phone;
		this.username = username;
		this.signin_password = signin_password;
		this.type_of_user = type_of_user;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSignin_password() {
		return signin_password;
	}
	public void setSignin_password(String signin_password) {
		this.signin_password = signin_password;
	}
	public String getType_of_user() {
		return type_of_user;
	}
	public void setType_of_user(String type_of_user) {
		this.type_of_user = type_of_user;
	}
	
	

}
