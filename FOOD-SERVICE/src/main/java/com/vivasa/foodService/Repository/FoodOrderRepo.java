package com.vivasa.foodService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivasa.foodService.Dao.FoodCart;
import com.vivasa.foodService.Dao.FoodOrder;

@Repository
public interface FoodOrderRepo extends JpaRepository<FoodOrder , Long>{

}
