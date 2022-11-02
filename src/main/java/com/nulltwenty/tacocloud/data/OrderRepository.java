package com.nulltwenty.tacocloud.data;

import com.nulltwenty.tacocloud.domain.model.TacoOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
