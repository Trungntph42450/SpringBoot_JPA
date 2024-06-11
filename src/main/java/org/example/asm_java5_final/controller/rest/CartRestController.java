package org.example.asm_java5_final.controller.rest;

import org.example.asm_java5_final.entity.Product;
import org.example.asm_java5_final.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CartRestController {
	@Autowired
	ProductService pService;
	@RequestMapping("/rest/products/{id}")
	public Product getOne(@PathVariable("id") Long id) {
		return pService.findById(id);
	}
}
