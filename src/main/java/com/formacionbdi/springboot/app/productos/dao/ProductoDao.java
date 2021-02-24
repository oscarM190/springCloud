package com.formacionbdi.springboot.app.productos.dao;

import com.formacionbdi.springboot.app.productos.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductoDao extends CrudRepository<Product, Long> {
}
