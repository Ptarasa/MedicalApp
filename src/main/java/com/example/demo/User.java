package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name="email", nullable=false, unique = true, length= 45)
		private String email;
		
		@Column(name="password", nullable=false, length=60)
		private String password;
		
		@Column(name="firstname", nullable=false,length= 45)
		private String firstname;
		
		@Column(name="lastname", nullable=false,length= 45)
		private String lastname;
		
		public User() {
			
		}
		
		public User(Long id, String email, String password, String firstname, String lastname, Form form) {
			super();
			this.id = id;
			this.email = email;
			this.password = password;
			this.firstname = firstname;
			this.lastname = lastname;
		}

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

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		
		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
		
		@Override
		public String toString() {
			return "User [id=" + id + ", email=" + email + ", password=" + password + ", firstname=" + firstname
					+ ", lastname=" + lastname + "]";
		}
		
		

	
}
