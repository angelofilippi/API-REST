package com.angelo.crud.repository;

import com.angelo.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
