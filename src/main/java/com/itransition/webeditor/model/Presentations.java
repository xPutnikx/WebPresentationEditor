package com.itransition.webeditor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Presentations {
	private static final long serialVersionUID = -1308795024262635690L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String userName;
    @Column
    private String JSON;
    @Column
    private String tags;
    @Column
    private String description;
	public Presentations() {
	}
	public Presentations(String userName,String JSON, String tags,String description) {
		super();
		this.userName = userName;
        this.JSON=JSON;
        this.tags=tags;
        this.description=description;
	}
	public Long getId() {
		return id;
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
    public String getJSON(){
        return JSON;
    }
    public void setJSON(String JSON){
        this.JSON=JSON;
    }
    public String getTags(){
        return tags;
    }
    public void setTags(String tags){
        this.tags=tags;
    }
    public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return super.toString() + " userName = " + userName
				+ " id = " + id +" JSON = " + JSON + " tags =" +tags + " description=" +description;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result
                + ((JSON == null) ? 0 : JSON.hashCode());
        result = prime * result
                + ((tags == null) ? 0 : tags.hashCode());
        result = prime * result
                + ((description == null) ? 0 : description.hashCode());
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
		Presentations other = (Presentations) obj;
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
        if (JSON==null) {
            if(other.JSON!=null)
                return false;
        } else if (!JSON.equals(other.JSON))
            return false;
        if (tags==null) {
            if(other.tags!=null)
                return false;
        } else if (!tags.equals(other.tags))
            return false;
        if (description==null) {
            if(other.description!=null)
                return false;
        } else if (!description.equals(other.description))
            return false;
		return true;
	}

}
