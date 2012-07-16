package com.itransition.webeditor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itransition.webeditor.core.PermessionDeniedException;
import com.itransition.webeditor.core.UserRolesTypes;
import com.itransition.webeditor.dao.UserRolesDao;
import com.itransition.webeditor.dao.UsersDao;
import com.itransition.webeditor.model.UserRoles;
import com.itransition.webeditor.model.Users;

@Service
public class UsersService {
	@Autowired
	private UsersDao usersDao;
	@Autowired
	private UserRolesDao userRolesDao;
	
	public Users findById(Long id) {
		return usersDao.findById(id);
	}
	
	public List<Users> getUsers() {
		return usersDao.getUsers();
	}
	
	public void save(Users users) {
		usersDao.save(users);
	}
	
	public List<String> getRolesById(Long id) {
		return userRolesDao.getRolesByUserId(id);
	}
	
	public boolean isAdministrator(Long id) {
		List<String> roles = getRolesById(id);
		for (String role : roles) {
			if (role.equals(UserRolesTypes.ROLE_ADMIN)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isUser(Long id) {
		List<String> roles = getRolesById(id);
		for (String role : roles) {
			if (role.equals(UserRolesTypes.ROLE_USER)) {
				return true;
			}
		}
		return false;
	}
	public void removeById(Long id) throws PermessionDeniedException {
		if (isAdministrator(id)) {
			throw new PermessionDeniedException();
		}
		usersDao.removeById(id);
		userRolesDao.removeByUserId(id);
	}
	
	public void registerById(Long id) {
		usersDao.setEnabledById(id, true);
		UserRoles userRoles = new UserRoles();
		userRoles.setUserId(id);
		userRoles.setAuthority(UserRolesTypes.ROLE_USER);
		userRolesDao.save(userRoles);
	}
	
	public void banById(Long id) throws PermessionDeniedException {
		if (isAdministrator(id)) {
			throw new PermessionDeniedException();
		}
		usersDao.setEnabledById(id, false);		
	}
	
	public void unbanById(Long id) {
		usersDao.setEnabledById(id, true);
	}
	
}
