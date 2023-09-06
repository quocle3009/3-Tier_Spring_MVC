package vn.edu.pxu.BT_3_tier.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import vn.edu.pxu.BT_3_tier.model.Product;
import vn.edu.pxu.BT_3_tier.service.ProductService;

public class ProductController {
	@Autowired
	public ProductService productService;

	@GetMapping("/products")
	public ModelAndView List() {
		List<Product> products = this.productService.findAll();
		ModelAndView modelAndView = new ModelAndView("product/list");
		modelAndView.addObject("products", products);
		return modelAndView;
	}

	@GetMapping("/new")
	public ModelAndView showCreateform() {
		ModelAndView modelAndView = new ModelAndView("product/create");
		modelAndView.addObject("product", new Product());
		return modelAndView;
	}

	@GetMapping("/new")
	public ModelAndView createProduct(@ModelAttribute("product") Product product) {
		int randomId = (int) (Math.random() * 10000);
		product.setId(randomId);
		this.productService.save(product);
		ModelAndView modelAndView = new ModelAndView("product/created");
		modelAndView.addObject("product", new Product());
		modelAndView.addObject("message", "New product was created");
		return modelAndView;
	}

	@GetMapping(value = "/view")
	public ModelAndView view(@RequestParam("id") Integer productid) {
		Product product = this.productService.findById(productid);
		ModelAndView modelAndView = new ModelAndView("product/view");
		modelAndView.addObject("product", product);
		return modelAndView;
	}

}
