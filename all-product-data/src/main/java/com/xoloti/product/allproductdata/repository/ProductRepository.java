package com.xoloti.product.allproductdata.repository;

import org.springframework.stereotype.Repository;

import com.xoloti.product.allproductdata.dom.ProductDom;

import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface ProductRepository extends JpaRepository<ProductDom, Long>{

}
