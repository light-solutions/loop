/**
 * 
 */
package com.light.loop.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.light.loop.cart.entity.Cart;;



/**
 * @author kiranlal
 *
 */
@Component
public interface CartRepository  extends JpaRepository<Cart, Long>{ 

}
