package vn.edu.pxu.BT_3_tier.repository;

import java.util.List;
import vn.edu.pxu.BT_3_tier.model.*;

public interface ProductRepository {
	List<Product> findAll();

	Product findById(int id);

	void save(Product product);
}
