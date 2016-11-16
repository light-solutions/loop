/**
 * 
 */
package com.light.loop.usermgmnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.light.loop.usermgmnt.entity.User;



/**
 * @author kiranlal
 *
 */
@Component
public interface UserRepository  extends JpaRepository<User, Long>{ 

}
