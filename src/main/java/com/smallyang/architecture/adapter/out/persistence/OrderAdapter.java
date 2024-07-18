package com.smallyang.architecture.adapter.out.persistence;

import com.smallyang.architecture.application.port.out.order.AddOrderPort;
import com.smallyang.architecture.application.port.out.order.UpdateOrderPort;
import org.springframework.stereotype.Component;

/**
 * @author USER
 * @date 2024-07-18 下午 11:44
 */
@Component
public class OrderAdapter implements UpdateOrderPort, AddOrderPort {
    private final OrderRepository orderRepository;
    @Override
    public void update() {

    }

    @Override
    public void add() {

    }
}
