package com.formacionbdi.springboot.app.productos.service.impl;

import com.formacionbdi.springboot.app.productos.dao.ProductoDao;
import com.formacionbdi.springboot.app.productos.entity.Product;
import com.formacionbdi.springboot.app.productos.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Product> findAll() {
        List<Product> products =  (List<Product>)productoDao.findAll();
        return products;
    }

    @Override
    public Product findById(Long id) {
        Optional<Product> product =  productoDao.findById(id);
        return product.orElse(null);
    }
}
