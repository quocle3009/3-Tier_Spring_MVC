package vn.edu.pxu.BT_3_tier.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import vn.edu.pxu.BT_3_tier.model.Product;
import vn.edu.pxu.BT_3_tier.repository.ProductRepository;

public class ProductServicelmpl implements ProductRepository{
	@Autowired
	public ProductRepository productRepository;

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return this.productRepository.findById(id);
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		this.productRepository.save(product);
	}
}
