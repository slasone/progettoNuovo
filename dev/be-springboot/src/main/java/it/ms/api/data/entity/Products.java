package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long product_id;

	@Column(name = "name")
	private String name;

	@Column(name = "link", unique = true)
	private String link;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private int price;

	@Column(name = "stock_quantity")
	private int stock_quantity;

	@OneToMany(mappedBy="products", cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@Column(name = "category_id")
	private Categories category_id;

	public Products() {

	}

	public Products(String name, String description, String link, int price, int stock_quantity) {
		this.name = name;
		this.description = description;
		this.link = link;
		this.stock_quantity = stock_quantity;
		this.price = price;
	}

}
