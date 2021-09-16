package com.tiwat.rankshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="product")

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	public int id;
	
	@Column(name="rank_name")
	public String rank_name;
	
	@Column(name="rank_description")
	public String rank_description;
	
	@Column(name="rank_price")
	public double rank_price;
	
	@Column(name="rank_image")
	public String rank_image;

	public Product() {}
	
	public Product(int id, String rank_name, String rank_description, double rank_price, String rank_image) {
		super();
		this.id = id;
		this.rank_name = rank_name;
		this.rank_description = rank_description;
		this.rank_price = rank_price;
		this.rank_image = rank_image;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRank_name() {
		return rank_name;
	}

	public void setRank_name(String rank_name) {
		this.rank_name = rank_name;
	}

	public String getRank_description() {
		return rank_description;
	}

	public void setRank_description(String rank_description) {
		this.rank_description = rank_description;
	}

	public double getRank_price() {
		return rank_price;
	}

	public void setRank_price(double rank_price) {
		this.rank_price = rank_price;
	}

	public String getRank_image() {
		return rank_image;
	}

	public void setRank_image(String rank_image) {
		this.rank_image = rank_image;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", rank_name=" + rank_name + ", rank_description=" + rank_description
				+ ", rank_price=" + rank_price + ", rank_image=" + rank_image + "]";
	}

}
