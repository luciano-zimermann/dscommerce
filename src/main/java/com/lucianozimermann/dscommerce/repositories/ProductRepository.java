package com.lucianozimermann.dscommerce.repositories;

import com.lucianozimermann.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>
{}
