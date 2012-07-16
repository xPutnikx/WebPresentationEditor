package com.itransition.webeditor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itransition.webeditor.dao.PresentationTagsDao;
import com.itransition.webeditor.dao.PresentationsDao;
import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.Presentations;

@Service
public class PresentationsService {
	@Autowired
	private PresentationsDao presentationsDao;
	@Autowired
	private TagsDao tagsDao;
	@Autowired
	private PresentationTagsDao presentationTagsDao;
	
	public Presentations findById(Long id) {
		return presentationsDao.findById(id);
	}
	
	public List<Presentations> getPresentations() {
		return presentationsDao.getPresentations();
	}
	
	public void save(Presentations presentations) {
		presentationsDao.save(presentations);
	}
	
	public void removeById(Long id) {
		presentationsDao.removeById(id);
	}
	
	public void removeByUserId(Long userId) {
		presentationsDao.removeByUserId(userId);
	}
	
}
