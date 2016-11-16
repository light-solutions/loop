/**
 * 
 */
package com.light.loop.usermgmnt.services;

import com.light.loop.usermgmnt.exceptions.ValidationException;
import com.light.loop.usermgmnt.transferobjects.UserSO;
import com.light.loop.usermgmnt.transferobjects.UserSessionSO;


/**
 * @author kiranlal
 *
 */
public interface UserService {

	public UserSO registerUser(UserSO userSO) throws ValidationException;
	public UserSessionSO loginUser(String userID, String password) throws ValidationException;

}
