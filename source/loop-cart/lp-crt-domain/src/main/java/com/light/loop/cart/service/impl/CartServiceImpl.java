/**
 * 
 */
package com.light.loop.cart.service.impl;

import java.util.List;

import com.light.loop.cart.CartService;
import com.light.loop.cart.transferobjects.CartItemSO;
import com.light.loop.cart.transferobjects.CartResultSO;
import com.light.loop.cart.transferobjects.CartSO;
import com.light.loop.cart.transferobjects.CartSearchSO;
import com.light.loop.common.exceptions.ServiceException;
import com.light.loop.common.transferobjects.ResponseSO;
import com.light.loop.common.transferobjects.UserSO;


/**
 * @author 58394
 *
 */
public class CartServiceImpl  implements CartService{

	@Override
	public ResponseSO createCartForUser(UserSO userRequest)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseSO addItemsToCart(List<CartItemSO> addToCartRequests,
			CartSO currentCart) throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseSO removeItemsFromCart(
			List<CartItemSO> removeFromCartRequests, CartSO currentCart)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartResultSO listAllCarts(CartSearchSO cartSearchSO)
			throws ServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
