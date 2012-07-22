package com.itransition.webeditor.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itransition.webeditor.dao.PresentationTagsDao;
import com.itransition.webeditor.dao.PresentationsDao;
import com.itransition.webeditor.dao.TagsDao;
import com.itransition.webeditor.model.PresentationTags;
import com.itransition.webeditor.model.Presentations;
import com.itransition.webeditor.model.Tags;

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

	public List<Presentations> findPresentationsByUserId(Long userId) {
		return presentationsDao.findByUserId(userId);
	}

	public List<Tags> findTagsByPresentationId(Long id) {
		List<PresentationTags> presentationTags = presentationTagsDao
				.findByPresentationId(id);
		List<Tags> tags = new ArrayList<Tags>();
		for (PresentationTags presentationTag : presentationTags) {
			Tags tag = tagsDao.findById(presentationTag.getTagId());
			tags.add(tag);
		}
		return tags;
	}

	public List<Presentations> searchByTitle(String title) {
		return presentationsDao.searchByTitle(title);
	}

	public List<Presentations> searchByTags(String[] tags) {
		List<Long> tagIds = findTagIds(tags);
		List<Long> presentationIds = findPresentationIds(tagIds);
		List<Presentations> presentations = findPresentations(presentationIds);
		return presentations;
	}

	public List<Presentations> searchByTitleAndTags(String title, String[] tags) {
		Set<Presentations> presentations = new HashSet<Presentations>();
		presentations.addAll(searchByTitle(title));
		presentations.addAll(searchByTags(tags));
		return new ArrayList<Presentations>(presentations);
	}

	public List<String> searchTagsByName(String tagName) {
		return tagsDao.searchByName(tagName);
	}

	public List<Presentations> getPresentations() {
		return presentationsDao.getPresentations();
	}

	public void save(Presentations presentations) {
		presentationsDao.save(presentations);
	}

	/**
	 * Add list of tags to Tags table and foreign keys to PresentationTags.
	 * Creates new tag if it doesn't exist.
	 * 
	 * @param tags
	 *            list of tags.
	 */
	public void addTags(List<String> tags, Long id) {
		for (String tag : tags) {
			Long tagId = tagsDao.findIdByName(tag);
			if (tagId == null) {
				Tags newTags = new Tags();
				newTags.setName(tag);
				tagsDao.save(newTags);
				Long newTagId = tagsDao.findIdByName(tag);
				PresentationTags presentationTags = new PresentationTags();
				presentationTags.setPresentationId(id);
				presentationTags.setTagId(newTagId);
				presentationTagsDao.save(presentationTags);
			}
		}
	}

	public void removeById(Long id) {
		presentationsDao.removeById(id);
	}

	public void removeByUserId(Long userId) {
		presentationsDao.removeByUserId(userId);
	}

	private List<Long> findTagIds(String[] tags) {
		List<Long> tagIds = new ArrayList<Long>();
		for (String tag : tags) {
			Long id = tagsDao.findIdByName(tag);
			if (id != null) {
				tagIds.add(id);
			}
		}
		return tagIds;
	}

	private List<Long> findPresentationIds(List<Long> tagIds) {
		List<Long> presentationIds = new ArrayList<Long>();
		for (Long tagId : tagIds) {
			List<Long> ids = presentationTagsDao
					.findPresentationIdsByTagId(tagId);
			for (Long id : ids) {
				presentationIds.add(id);
			}
		}
		return presentationIds;
	}

	private List<Presentations> findPresentations(List<Long> presentationIds) {
		List<Presentations> presentations = new ArrayList<Presentations>();
		for (Long presentationId : presentationIds) {
			Presentations presentation = presentationsDao
					.findById(presentationId);
			presentations.add(presentation);
		}
		return presentations;
	}

}
