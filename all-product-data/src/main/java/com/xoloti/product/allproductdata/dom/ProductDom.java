package com.xoloti.product.allproductdata.dom;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="product")
@Data
@AllArgsConstructor
@NoArgsConstructor
//@DynamicUpdate
public class ProductDom {

	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "product_seq")
	//@SequenceGenerator(name="product_seq", sequenceName="product_seq", allocationSize = 1)
	private Long productId;
	
	@Column(name="product_name")
	private String productName;
	
	
}
