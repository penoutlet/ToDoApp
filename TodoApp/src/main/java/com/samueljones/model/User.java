package com.samueljones.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Doers")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(unique=true,nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String password;

//	@OneToMany
//	@JoinColumn
//	@Column
//	private ToDoItem toDoItem;
	
	
//	public ToDoItem getToDoItem() {
//		return toDoItem;
//	}

//	public void setToDoItem(ToDoItem toDoItem) {
//		this.toDoItem = toDoItem;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	
	
	
}
