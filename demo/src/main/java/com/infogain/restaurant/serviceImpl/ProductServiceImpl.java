package com.infogain.restaurant.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infogain.restaurant.entity.Product;
import com.infogain.restaurant.repository.ProductRepository;
import com.infogain.restaurant.services.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductRepository productRepository;
	@Override
	public Optional<Product> getProduct(long id) {
		return productRepository.findById(id);
	}

}
