package com.vinegrad.fruitapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vinegrad.fruitapp.model.Fruit;
import com.vinegrad.fruitapp.model.FruitOrder;

@RequestMapping("/order")
@RestController
public class OrderController {
	
	private FruitOrder fruitOrder;
	
	public OrderController() {
		fruitOrder = new FruitOrder();
	}
	
	@PostMapping("/add")
	public FruitOrder buyOrder(@RequestBody FruitOrder fruitOrder) {
		for(Fruit fruit : fruitOrder.getOrder()) {
			this.fruitOrder.add(fruit);
		}
		return this.fruitOrder;
	}
	
}
