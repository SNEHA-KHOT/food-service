package com.vivasa.foodService.service;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import com.vivasa.foodService.Dao.FoodCart;
import com.vivasa.foodService.Dto.FoodCartDto;
import com.vivasa.foodService.Dto.FoodOrderDto;

public interface UserService {

	Object addCart(FoodCartDto foodCartDto);

	MultiValueMap<String, String> orderPlacement(FoodOrderDto foodOrderDto);

}
