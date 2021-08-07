package com.prsolutions.freshveggiesproduct.resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prsolutions.freshveggiesproduct.model.Vegetable;

@RestController
@RequestMapping("/veggies")
public class VegetableInformation {

	@RequestMapping("/{veggiId}")
	public Vegetable getVegetableInfo(@PathVariable("veggiId") int veggiId) {
		return new Vegetable(veggiId, "Potato", "Organic potato small size");
	}
}
