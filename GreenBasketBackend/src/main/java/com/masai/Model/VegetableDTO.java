package com.masai.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;



@Data
@AllArgsConstructor
@NoArgsConstructor
public class VegetableDTO {


	private Integer vegId;
	private String name;

	private Double price;
	private Integer quantity;
	private String imageUrl;

	public VegetableDTO(Integer vegId, String name, Double price, String imageUrl) {
		this.vegId = vegId;
		this.name = name;
		this.price = price;
		this.imageUrl = imageUrl;
	}


}
