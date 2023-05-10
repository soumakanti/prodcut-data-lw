package com.xoloti.product.allproductdata.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xoloti.product.allproductdata.dto.ProductDto;
import com.xoloti.product.allproductdata.exception.BusinessServiceException;
import com.xoloti.product.allproductdata.exception.CustomRuntimeException;
import com.xoloti.product.allproductdata.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(path = "/getproducts",method = RequestMethod.GET)
	public ResponseEntity<List<ProductDto>> getAllProducts() throws BusinessServiceException, CustomRuntimeException{
		List<ProductDto> productDto = productService.fetchAllProducts();
		
		return new ResponseEntity<List<ProductDto>>(productDto, HttpStatusCode.valueOf(200)); 
	}
}
