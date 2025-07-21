package com.E_Commerce.service;

import java.util.List;

import com.E_Commerce.exception.ProductException;
import com.E_Commerce.modal.Rating;
import com.E_Commerce.modal.User;
import com.E_Commerce.dtos.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
