package vn.edu.pxu.BT_3_tier.repository;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import vn.edu.pxu.BT_3_tier.model.Product;
import java.util.HashMap;
public class ProductRepositorylmpl implements ProductRepository {
	private static final Map<Integer, Product> products;
	static {
		products = new HashMap();
		products.put(1, new Product(1, "A", "ABC", 1000));
		products.put(2, new Product(2, "B", "XYZ", 1000));
		products.put(3, new Product(3, "C", "ABC", 1000));
		products.put(4, new Product(4, "D", "ABC", 1000));
		products.put(5, new Product(5, "E", "XYZ", 1000));
	}

	@Override
	public List<Product> findAll() {
		return new ArrayList<>(products.values());

	}
	@Override
	public Product findById(int id) {
		Product product = products.get(id);
		return product;

	}
	@Override
	public void save(Product product) {
		products.put(product.getId(), product);
	}
}
