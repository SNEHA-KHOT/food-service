package com.vivasa.foodService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vivasa.foodService.Dao.FoodCart;
import com.vivasa.foodService.Dto.FoodCartDto;
import com.vivasa.foodService.Dto.FoodOrderDto;
import com.vivasa.foodService.service.UserService;

@RestController
public class UserController {
	
	
	@Autowired
	UserService userService;
	
	
	@PostMapping("/addToCart")
	public ResponseEntity<Object> addCart(@RequestBody FoodCartDto foodCartDto ){
		return new ResponseEntity<Object>(userService.addCart(foodCartDto),HttpStatus.CREATED );
		
	}
	
	@PostMapping("/order")
	public ResponseEntity<Object> orderPlacement(@RequestBody FoodOrderDto foodOrderDto ){
		return new ResponseEntity<Object>(userService.orderPlacement(foodOrderDto),HttpStatus.CREATED );
		
	}

}
