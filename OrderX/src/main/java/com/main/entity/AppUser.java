/**
 * 
 */
package com.main.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


/**
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type")
public class AppUser {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appUser;

	@Column(unique = true, nullable = false)
	private String firstName;
	
	@Column(unique = true, nullable = false)
	private String lastName;
	
    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String name;
    private String phone;

    @Enumerated(EnumType.STRING)
    private Role role;

	public Long getAppUser() {
		return appUser;
	}

	public void setAppUser(Long appUser) {
		this.appUser = appUser;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "AppUser [appUser=" + appUser + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", phone=" + phone + ", role=" + role + "]";
	}

}

enum Role {
    CUSTOMER, VENDOR
}