package com.itransition.webeditor.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PresentationTags implements Serializable {	
	private static final long serialVersionUID = -1308795024262635690L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String presentationId;
	@Column
	private String tagId;

	public PresentationTags() {
	}

	public PresentationTags(String presentationId, String tagId) {
		super();
		this.presentationId = presentationId;
		this.tagId = tagId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPresentationId() {
		return presentationId;
	}

	public void setPresentationId(String userId) {
		this.presentationId = userId;
	}

	public String getTagId(){
		return tagId;
	}

	public void setTagId(String tagId){
		this.tagId = tagId;
	}
	
}
