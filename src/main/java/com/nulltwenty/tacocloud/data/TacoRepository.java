package com.nulltwenty.tacocloud.data;

import com.nulltwenty.tacocloud.model.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
