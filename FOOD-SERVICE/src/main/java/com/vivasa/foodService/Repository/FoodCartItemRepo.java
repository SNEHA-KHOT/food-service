package com.vivasa.foodService.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivasa.foodService.Dao.FoodCart;
import com.vivasa.foodService.Dao.FoodCartItem;

@Repository
public interface FoodCartItemRepo extends JpaRepository<FoodCartItem , Long>{

	List<FoodCartItem> findByFoodCartCartId(long cartId);

}
