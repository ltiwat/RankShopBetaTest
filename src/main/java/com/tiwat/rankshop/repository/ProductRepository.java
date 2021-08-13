package com.tiwat.rankshop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tiwat.rankshop.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT p FROM Product p WHERE CONCAT(p.rank_name,' ',p.rank_description,' ',p.rank_price) LIKE %?1%")
	public List<Product> search(String keyword);
}
