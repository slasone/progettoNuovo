package it.ms.api.data.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long category_id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	public Categories() {

	}

	public Categories(String name, String description) {
		this.description = description;
        this.name = name;
	}

	public long getId() {
		return category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Category [id=" + category_id + ", name=" + name + "]";
	}
}

