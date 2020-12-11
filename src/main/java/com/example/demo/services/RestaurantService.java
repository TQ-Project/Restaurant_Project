package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entities.Restaurant;
import com.example.demo.repository.RestaurantRepository;

@Service
public class RestaurantService {
    @Autowired
	private RestaurantRepository repo;
	
    String status="active";
    
    //For Post Request
	public Restaurant saveRestaurant(Restaurant resto) {
	     return repo.save(new Restaurant(resto.getId(),resto.getName(),resto.getPhone(),resto.getAddress(),resto.getInTime(),resto.getOutTime(),status));
	}
	
	public List<Restaurant> saveRestaurants(List<Restaurant> resto){
		return repo.saveAll(resto);
	}
	
	//For Get request
	
	public Restaurant getRestaurantById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<Restaurant> getRestaurants(){
	   return repo.findAll();	
	}
	
	//For delete Request

	public String deleteRestaurantById(int id) {
		repo.deleteById(id);
		return "Restaurant Deleted !!!"  +id;
	}

	//For Update Product
	
	public Restaurant updateRestaurant(Restaurant resto) {
	
		Restaurant rest=  repo.findById(resto.getId()).orElse(null);
		    rest.setName(resto.getName());
            rest.setPhone(resto.getPhone());
            rest.setAddress(resto.getAddress());
            rest.setInTime(resto.getInTime());
            rest.setOutTime(resto.getOutTime());
            return repo.save(rest);
	}

	
	















}
