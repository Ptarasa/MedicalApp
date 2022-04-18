package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Form")
public class Form {
	@Id
	public Long id;
	
	@Column(name="email")
	public String email;
	
	@Column(name="date")
	public String date;
	
	@Column(name="cold")
	public String cold;
	
	@Column(name="symptoms")
	public String symptoms;
	
	@Column(name="breathing")
	public String breathing;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCold() {
		return cold;
	}
	public void setCold(String cold) {
		this.cold = cold;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getBreathing() {
		return breathing;
	}
	public void setBreathing(String breathing) {
		this.breathing = breathing;
	}
	
	@Override
	public String toString() {
		return "Form [id=" + id + ", email=" + email + ", date=" + date + ", cold=" + cold + ", symptoms=" + symptoms
				+ ", breathing=" + breathing + "]";
	}
	
}
