package vn.edu.pxu.BT_3_tier.model;

public class Product {
	private int Id;
	private String code;
	private String name;
	private double price;

	public Product() {
		super();
	}

	public Product(int id, String code, String name, double price) {
		super();
		Id = id;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}