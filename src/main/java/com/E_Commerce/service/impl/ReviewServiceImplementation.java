package com.E_Commerce.service.impl;

import java.time.LocalDateTime;
import java.util.List;

import com.E_Commerce.service.ProductService;
import com.E_Commerce.service.ReviewService;
import org.springframework.stereotype.Service;

import com.E_Commerce.exception.ProductException;
import com.E_Commerce.modal.Product;
import com.E_Commerce.modal.Review;
import com.E_Commerce.modal.User;
import com.E_Commerce.repository.ProductRepository;
import com.E_Commerce.repository.ReviewRepository;
import com.E_Commerce.dtos.request.ReviewRequest;

@Service
public class ReviewServiceImplementation implements ReviewService {
	
	private ReviewRepository reviewRepository;
	private ProductService productService;
	private ProductRepository productRepository;
	
	public ReviewServiceImplementation(ReviewRepository reviewRepository,ProductService productService,ProductRepository productRepository) {
		this.reviewRepository=reviewRepository;
		this.productService=productService;
		this.productRepository=productRepository;
	}

	@Override
	public Review createReview(ReviewRequest req,User user) throws ProductException {
		// TODO Auto-generated method stub
		Product product=productService.findProductById(req.getProductId());
		Review review=new Review();
		review.setUser(user);
		review.setProduct(product);
		review.setReview(req.getReview());
		review.setCreatedAt(LocalDateTime.now());
		
//		product.getReviews().add(review);
		productRepository.save(product);
		return reviewRepository.save(review);
	}

	@Override
	public List<Review> getAllReview(Long productId) {
		
		return reviewRepository.getAllProductsReview(productId);
	}

}
