package com.smallyang.architecture.adapter.out.persistence.repository;

import org.springframework.core.annotation.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author USER
 * @date 2024-07-18 下午 11:47
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
