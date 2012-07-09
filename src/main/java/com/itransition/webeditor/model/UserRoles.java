package com.itransition.webeditor.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class UserRoles implements Serializable {
	private static final long serialVersionUID = -1308795024262635690L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private Long userId;
    @Column
    private String authority;
	public UserRoles() {
	}
	public UserRoles(Long userId,String authority) {
		super();
		this.userId = userId;
        this.authority=authority;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
}
