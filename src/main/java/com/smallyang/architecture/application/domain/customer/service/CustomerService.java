package com.smallyang.architecture.application.domain.customer.service;

import com.smallyang.architecture.application.port.in.CustomerUseCase2;
import com.smallyang.architecture.application.port.out.order.UpdateOrderPort;
import org.springframework.stereotype.Service;

/**
 * @author USER
 * @date 2024-07-18 下午 11:26
 */

@Service
public class CustomerService implements CustomerUseCase2 {
    public CustomerService(UpdateOrderPort updateOrderPort) {
        this.updateOrderPort = updateOrderPort;
    }

    // service 調用port
    private final UpdateOrderPort updateOrderPort;
    @Override
    public void ming() {
        updateOrderPort.update();
    }
}
