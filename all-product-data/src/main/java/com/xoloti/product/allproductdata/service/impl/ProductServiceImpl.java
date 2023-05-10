package com.xoloti.product.allproductdata.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import com.xoloti.product.allproductdata.dom.ProductDom;
import com.xoloti.product.allproductdata.dto.ProductDto;
import com.xoloti.product.allproductdata.exception.BusinessServiceException;
import com.xoloti.product.allproductdata.exception.CustomRuntimeException;
import com.xoloti.product.allproductdata.repository.ProductRepository;
import com.xoloti.product.allproductdata.service.ProductService;

@Component
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<ProductDto> fetchAllProducts() throws BusinessServiceException, CustomRuntimeException{
		// TODO Auto-generated method stub
		List<ProductDom> productDomList = productRepository.findAll();
		List<ProductDto> productDtoList = new LinkedList<>(); 
		if(!CollectionUtils.isEmpty(productDomList)) {
			productDomList.stream().forEach(data->{
				ProductDto productDto = modelMapper.map(data, ProductDto.class);
				productDtoList.add(productDto);
			});
		}
		
		return productDtoList;
	}

}
