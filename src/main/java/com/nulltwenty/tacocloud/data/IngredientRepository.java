package com.nulltwenty.tacocloud.data;

import com.nulltwenty.tacocloud.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
