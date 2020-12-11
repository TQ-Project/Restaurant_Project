package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Restaurant;
import com.example.demo.services.RestaurantService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class RestaurantController {

	@Autowired
	private RestaurantService service;
	
	
	//For Post product
	
	@PostMapping("/addRestaurant")
	public Restaurant addRestaurant(@RequestBody Restaurant resto) {
		return service.saveRestaurant(resto);
	}
	
	@PostMapping("/addRestaurants")
	public List<Restaurant> addRestaurants(@RequestBody List<Restaurant> resto){
		return service.saveRestaurants(resto);
	}
	
	// For Get Product
	
	@GetMapping("/Restaurant/{id}")
	public Restaurant getRestaurant(@PathVariable int id) {
		return service.getRestaurantById(id);
	}
	@GetMapping("/Restaurants")
	public List<Restaurant> getRestaurants(){
		return service.getRestaurants();
	}
	
	
	// For update Product
	
	@PutMapping("/updateRestaurant")
	public Restaurant updateRestaurant(@RequestBody Restaurant resto) {
		return service.updateRestaurant(resto);
	}
	
	// For delete Product
	
	@DeleteMapping("/deleteRestaurant/{id}")
	public String deleteRestaurant(@PathVariable int id) {
		return service.deleteRestaurantById(id);
	}
	
}
