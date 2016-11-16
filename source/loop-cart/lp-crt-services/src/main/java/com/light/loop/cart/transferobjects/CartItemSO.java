/**
 * 
 */
package com.light.loop.cart.transferobjects;

/**
 * @author 58394
 *
 */
public class CartItemSO {

	private Long cartItemID;
	private CartSO parentCartSO;
	private Long itemID;
	private String itemCode;
	private Float itemUnitPrice;
	private String itemCurrency;
	private int itemQuantity;

	public Long getCartItemID() {
		
		return cartItemID;
	}

	public CartSO getParentCartSO() {
		
		return parentCartSO;
	}

	public Long getItemID() {
		
		return itemID;
	}

	public String getItemCode() {
		
		return itemCode;
	}

	public Float getItemUnitPrice() {
		
		return itemUnitPrice;
	}


	public String getItemCurrency() {
		
		return itemCurrency;
	}

	public int getItemQuantity() {
		
		return itemQuantity;
	}

}
