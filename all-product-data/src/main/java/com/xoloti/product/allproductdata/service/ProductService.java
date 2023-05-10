package com.xoloti.product.allproductdata.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.xoloti.product.allproductdata.dto.ProductDto;
import com.xoloti.product.allproductdata.exception.BusinessServiceException;
import com.xoloti.product.allproductdata.exception.CustomRuntimeException;

@Component
public interface ProductService {

	public List<ProductDto> fetchAllProducts()throws BusinessServiceException, CustomRuntimeException;
}
