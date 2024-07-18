package com.smallyang.architecture.application.service;

import com.smallyang.architecture.application.domain.customer.service.CustomerService;
import com.smallyang.architecture.application.port.in.CrossUseCase;
import org.springframework.stereotype.Service;

/**
 * @author USER
 * @date 2024-07-18 下午 11:16
 */
@Service
public class CrossService implements CrossUseCase {
    public CrossService(CustomerService c, OrderService o) {
        this.c = c;
        this.o = o;
    }

    private final CustomerService c;
    private final OrderService o;

    @Override
    public void ming() {
        c.xxx;
//                o.
    }
}
