/**
 * 
 */
package com.light.loop.cart.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.light.loop.cart.transferobjects.CartSO;

/**
 * @author 58394
 *
 */
public class Cart extends CartSO{

	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="InvTab")
	@TableGenerator(name="InvTab", table="seq_gen",
     pkColumnName="ID_NAME", valueColumnName="ID_VAL",
     pkColumnValue="cart_id")
	@Column(name="CART_ID")
	public Long getCartID() {
		// TODO Auto-generated method stub
		return super.getCartID();
	}

	@Column(name="USER_ID")
	public String getUserID() {
		// TODO Auto-generated method stub
		return super.getUserID();
	}

	@Column(name="USER_NAME")
	public String getUserName() {
		// TODO Auto-generated method stub
		return super.getUserName();
	}

	@Column(name="CART_SES_KEY")
	public String getCartKey() {
		// TODO Auto-generated method stub
		return super.getCartKey();
	}
}
