package com.vinegrad.fruitapp.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class FruitOrder {

	private List<Fruit> order;
	private int price;
	
	public FruitOrder() {
		order = new ArrayList<>();
	}
	
	public void add(Fruit fruit) {
		order.add(fruit);
		price += fruit.getPrice();
	}
}
