/**
 * 
 */
package com.light.loop.cart.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

import com.light.loop.cart.transferobjects.CartItemSO;
import com.light.loop.cart.transferobjects.CartSO;

/**
 * @author 58394
 *
 */
public class CartItem extends CartItemSO{

	@Id
	@GeneratedValue(strategy=GenerationType.TABLE,generator="InvTab")
	@TableGenerator(name="InvTab", table="seq_gen",
     pkColumnName="ID_NAME", valueColumnName="ID_VAL",
     pkColumnValue="cartitem_id")
	@Column(name="CART_ITM_ID")
	public Long getCartItemID() {
		
		return super.getCartItemID();
	}

	@Column(name="CART_ITM_ID")
	public CartSO getParentCartSO() {
		
		return super.getParentCartSO();
	}

	@Column(name="ITM_ID")
	public Long getItemID() {
		
		return super.getItemID();
	}

	@Column(name="ITM_CODE")
	public String getItemCode() {
		
		return super.getItemCode();
	}

	@Column(name="ITM_UNIT_PRICE")
	public Float getItemUnitPrice() {
		
		return super.getItemUnitPrice();
	}

	@Column(name="ITM_UNIT_CRNCY")
	public String getItemCurrency() {
		
		return super.getItemCurrency();
	}

	@Column(name="ITM_QTY")
	public int getItemQuantity() {
		
		return super.getItemQuantity();
	}

}
