package com.smallyang.architecture.application.service;

import com.smallyang.architecture.application.domain.customer.service.CustomerService;
import com.smallyang.architecture.application.domain.order.service.OrderService;
import com.smallyang.architecture.application.port.in.CustomerUseCase2;
import org.springframework.stereotype.Service;

/**
 * 程式資訊摘要: HexagonalArchitecture<P>
 * 程式內容說明: <P>
 * 程式修改紀錄:<P>
 *
 * @author Eric Yang
 * @version 1.0
 * @date 2024/7/19 09:35
 */
@Service
public class OrderAndCustomerUpdate implements CustomerUseCase2 {
    private final CustomerService c;
    private final OrderService o;

    public OrderAndCustomerUpdate(CustomerService c, OrderService o) {
        this.c = c;
        this.o = o;
    }

    @Override
    public void ming() {

    }
}
