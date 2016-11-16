package com.light.loop.cart;

import java.util.List;

import com.light.loop.cart.transferobjects.CartItemSO;
import com.light.loop.cart.transferobjects.CartResultSO;
import com.light.loop.cart.transferobjects.CartSO;
import com.light.loop.cart.transferobjects.CartSearchSO;
import com.light.loop.common.exceptions.ServiceException;
import com.light.loop.common.transferobjects.ResponseSO;
import com.light.loop.common.transferobjects.UserSO;


public interface CartService {

	ResponseSO createCartForUser(UserSO userRequest) throws ServiceException;

	ResponseSO addItemsToCart(List<CartItemSO> addToCartRequests, CartSO currentCart) throws ServiceException;

	ResponseSO removeItemsFromCart(List<CartItemSO> removeFromCartRequests, CartSO currentCart) throws ServiceException;

	CartResultSO listAllCarts(CartSearchSO cartSearchSO) throws ServiceException;

}
