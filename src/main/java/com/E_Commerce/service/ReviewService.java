package com.E_Commerce.service;

import java.util.List;

import com.E_Commerce.exception.ProductException;
import com.E_Commerce.modal.Review;
import com.E_Commerce.modal.User;
import com.E_Commerce.dtos.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
