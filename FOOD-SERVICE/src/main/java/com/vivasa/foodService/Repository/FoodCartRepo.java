package com.vivasa.foodService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivasa.foodService.Dao.FoodCart;

@Repository
public interface  FoodCartRepo extends JpaRepository<FoodCart , Long>{
	
	FoodCart findById(long id);
}
