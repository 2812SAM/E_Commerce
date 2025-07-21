package com.E_Commerce.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.E_Commerce.service.ProductService;
import com.E_Commerce.service.RatingServices;
import org.springframework.stereotype.Service;

import com.E_Commerce.exception.ProductException;
import com.E_Commerce.modal.Product;
import com.E_Commerce.modal.Rating;
import com.E_Commerce.modal.User;
import com.E_Commerce.repository.RatingRepository;
import com.E_Commerce.dtos.request.RatingRequest;

@Service
public class RatingServiceImplementation implements RatingServices {
	
	private RatingRepository ratingRepository;
	private ProductService productService;
	
	public RatingServiceImplementation(RatingRepository ratingRepository,ProductService productService) {
		this.ratingRepository=ratingRepository;
		this.productService=productService;
	}

	@Override
	public Rating createRating(RatingRequest req,User user) throws ProductException {
		
		Product product=productService.findProductById(req.getProductId());
		
		Rating rating=new Rating();
		rating.setProduct(product);
		rating.setUser(user);
		rating.setRating(req.getRating());
		rating.setCreatedAt(LocalDateTime.now());
		
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getProductsRating(Long productId) {
		// TODO Auto-generated method stub
		return ratingRepository.getAllProductsRating(productId);
	}
	
	

}
