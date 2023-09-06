package vn.edu.pxu.BT_3_tier.service;
import java.util.List;
import vn.edu.pxu.BT_3_tier.model.*;
public interface ProductService {
	List<Product> findAll();

	Product findById(int id);

	void save(Product product);

	
}
