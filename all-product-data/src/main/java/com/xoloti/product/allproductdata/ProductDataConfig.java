package com.xoloti.product.allproductdata;

import javax.sql.DataSource;

import org.modelmapper.ModelMapper;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ProductDataConfig {

	@Bean
	public RestTemplate getRestRemplate() {
		return new RestTemplate();
	}
	
	/*@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dsBuilder = DataSourceBuilder.create();
		dsBuilder.driverClassName("org.h2.Driver");
		dsBuilder.url("jdbc:h2:mem:testdb");
		dsBuilder.username("sa");
		dsBuilder.password("");
		return dsBuilder.build();
		
	}*/
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}
