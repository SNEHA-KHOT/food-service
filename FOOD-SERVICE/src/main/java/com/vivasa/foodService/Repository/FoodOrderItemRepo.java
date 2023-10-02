package com.vivasa.foodService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivasa.foodService.Dao.FoodOrder;
import com.vivasa.foodService.Dao.FoodOrderItem;

@Repository
public interface FoodOrderItemRepo extends JpaRepository<FoodOrderItem , Long>{

}
