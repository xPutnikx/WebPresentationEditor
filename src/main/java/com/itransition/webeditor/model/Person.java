package com.itransition.webeditor.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Person implements Serializable {
	private static final long serialVersionUID = -1308795024262635690L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String userName;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private boolean isActive;
	public Person() {
	}
	public Person(String userName,String password, String email,boolean isActive) {
		super();
		this.userName = userName;
        this.password=password;
        this.email=email;
        this.isActive=isActive;

	}
	public Long getId() {
		return id;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }
	@Override
	public String toString() {
		return super.toString() + " name = " + userName
				+ " id = " + id +" password = " + password + " email =" +email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result
                + ((password == null) ? 0 : password.hashCode());
        result = prime * result
                + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
        if (password==null) {
            if(other.password!=null)
                return false;
        } else if (!password.equals(other.password))
            return false;
        if (email==null) {
            if(other.email!=null)
                return false;
        } else if (!email.equals(other.email))
            return false;
		return true;
	}
}
