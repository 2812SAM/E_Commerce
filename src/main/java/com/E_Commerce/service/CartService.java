package com.E_Commerce.service;

import com.E_Commerce.exception.ProductException;
import com.E_Commerce.modal.Cart;
import com.E_Commerce.modal.CartItem;
import com.E_Commerce.modal.User;
import com.E_Commerce.dtos.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public CartItem addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
