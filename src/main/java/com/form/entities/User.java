package com.form.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	@Column(unique = true)
	private String preferedCodeLanguage;
	private String standardInput;
	@Column(length=100)
	private String sourceCode;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPreferedCodeLanguage() {
		return preferedCodeLanguage;
	}
	public void setPreferedCodeLanguage(String preferedCodeLanguage) {
		this.preferedCodeLanguage = preferedCodeLanguage;
	}
	public String getStandardInput() {
		return standardInput;
	}
	public void setStandardInput(String standardInput) {
		this.standardInput = standardInput;
	}
	public String getSourceCode() {
		return sourceCode;
	}
	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}
	
	
	
	
	
	
	
}
