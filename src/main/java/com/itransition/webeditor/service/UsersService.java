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

/**
 * The service provides the basic functions for creating, updating, removing
 * users and their permissions.
 * 
 */
@Service
public class UsersService {
	@Autowired
	private UsersDao usersDao;
	@Autowired
	private UserRolesDao userRolesDao;

	/**
	 * Finds user with specified id.
	 * 
	 * @param id
	 *            user id.
	 * @return user.
	 */
	public Users findById(Long id) {
		return usersDao.findById(id);
	}

	/**
	 * Gets list of users.
	 * 
	 * @return list of users.
	 */
	public List<Users> getUsers() {
		return usersDao.getUsers();
	}

	/**
	 * Saves or overrides specified user.
	 * 
	 * @param users
	 *            user.
	 */
	public void save(Users users) {
		usersDao.save(users);
	}

	/**
	 * Gets the role of specified user by its id .
	 * 
	 * @param id
	 *            user id.
	 * @return user role.
	 */
	public String getRoleById(Long id) {
		return userRolesDao.getRoleByUserId(id);
	}

	/**
	 * Checks administration rights of the specified user.
	 * 
	 * @param id
	 *            user id.
	 * @return returns true if the user is administrator.
	 */
	public boolean isAdministrator(Long id) {
		String role = userRolesDao.getRoleByUserId(id);
		if (role.equals(UserRolesTypes.ROLE_ADMIN)) {
			return true;
		}
		return false;
	}

	/**
	 * Checks default rights of the specified user.
	 * 
	 * @param id
	 *            user id.
	 * @return returns true if user has user rights.
	 */
	public boolean isUser(Long id) {
		String role = userRolesDao.getRoleByUserId(id);
		if (role.equals(UserRolesTypes.ROLE_USER)) {
			return true;
		}
		return false;
	}

	/**
	 * Changes user rights to administration.
	 * 
	 * @param id
	 *            user id.
	 */
	public void makeAdministrator(Long id) {
		UserRoles userRoles = (UserRoles) userRolesDao.findByUserId(id);
		userRoles.setAuthority(UserRolesTypes.ROLE_ADMIN);
		userRolesDao.save(userRoles);
	}

	/**
	 * Changes user rights to defaults.
	 * 
	 * @param id
	 *            user id.
	 */
	public void makeUser(Long id) {
		UserRoles userRoles = (UserRoles) userRolesDao.findByUserId(id);
		userRoles.setAuthority(UserRolesTypes.ROLE_USER);
		userRolesDao.save(userRoles);
	}

	/**
	 * Removes specified user and its permission by id.
	 * 
	 * @param id
	 *            user id.
	 */
	public void removeById(Long id) {
		usersDao.removeById(id);
		userRolesDao.removeByUserId(id);
	}

	/**
	 * Registers specified user by id.
	 * 
	 * @param id
	 *            user id.
	 */
	public void registerById(Long id) {
		usersDao.setEnabledById(id, true);
		UserRoles userRoles = new UserRoles();
		userRoles.setUserId(id);
		userRoles.setAuthority(UserRolesTypes.ROLE_USER);
		userRolesDao.save(userRoles);
	}

	/**
	 * Bans specified user by id. Only administrators can bans or unbans users.
	 * 
	 * @param id
	 *            user id.
	 * @throws PermessionDeniedException
	 */
	public void banById(Long id) throws PermessionDeniedException {
		if (isAdministrator(id)) {
			throw new PermessionDeniedException();
		}
		usersDao.setEnabledById(id, false);
	}

	/**
	 * Unbans specified user by id. Only administrators can bans or unbans
	 * users.
	 * 
	 * @param id
	 *            user id.
	 */
	public void unbanById(Long id) {
		usersDao.setEnabledById(id, true);
	}

	/**
	 * Gets user by its name.
	 * 
	 * @param name
	 *            user name.
	 * @return user.
	 */
	public Users getUserByName(String name) {
		return usersDao.getUserByName(name);

	}

	/**
	 * Gets user by its id.
	 * 
	 * @param id
	 *            user id.
	 * @return user.
	 */
	public Users getUserById(Long id) {
		return usersDao.getUserById(id);
	}

}
