package org.example.asm_java5_final.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.example.asm_java5_final.entity.Order;

import java.util.List;

public interface OrderService {
    Order create(JsonNode order);

    Order findById(Long id);

    List<Order> findByUsername(String username);

//	Double sumCostInMonth(Integer month);

    List<Order> findOrderInMonth(Integer month);

    Integer countOrderInMonth(Integer month);

}
