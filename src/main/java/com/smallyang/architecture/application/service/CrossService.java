package com.smallyang.architecture.application.service;

import com.smallyang.architecture.application.domain.customer.service.CustomerService;
import com.smallyang.architecture.application.domain.order.service.OrderService;
import com.smallyang.architecture.application.port.in.CrossUseCase;
import org.springframework.stereotype.Service;

/**
 * @author USER
 * 實作CrossUseCase，如果該方法同時需要用到兩個domain的話，在application的servcie package額外抽出來處理
 * 引入
 *  private final CustomerService c;
 *  private final OrderService o;
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
        c.ming();
        o.updateOrder();
//                o.
    }
}
