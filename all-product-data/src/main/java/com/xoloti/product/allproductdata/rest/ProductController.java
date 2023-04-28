package com.xoloti.product.allproductdata.rest;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xoloti.product.allproductdata.dto.ProductDto;

@RestController
public class ProductController {

	@RequestMapping(path = "/getproduct",method = RequestMethod.GET)
	public ResponseEntity<ProductDto> getAllProducts(){
		ProductDto productDto = new ProductDto();
		return new ResponseEntity<>(productDto, HttpStatusCode.valueOf(200)); 
	}
}
