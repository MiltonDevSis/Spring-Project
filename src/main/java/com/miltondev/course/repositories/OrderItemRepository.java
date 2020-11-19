package com.miltondev.course.repositories;

import com.miltondev.course.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
