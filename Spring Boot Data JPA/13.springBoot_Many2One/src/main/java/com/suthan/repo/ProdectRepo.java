package com.suthan.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suthan.model.Product;

public interface ProdectRepo extends JpaRepository<Product, Integer> {

}
