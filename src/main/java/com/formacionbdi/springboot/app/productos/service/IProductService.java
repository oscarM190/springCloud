package com.formacionbdi.springboot.app.productos.service;

import com.formacionbdi.springboot.app.productos.entity.Product;

import java.util.List;

public interface IProductService {
    public List<Product> findAll();
    public Product findById(Long id);
}
