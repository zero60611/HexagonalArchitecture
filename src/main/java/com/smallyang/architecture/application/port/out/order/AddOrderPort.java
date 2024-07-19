package com.smallyang.architecture.application.port.out.order;

/**
 * @author USER
 * out的package有指定是從哪個domain
 * @date 2024-07-18 下午 11:46
 */
public interface AddOrderPort {
    // db操作 或call外部API
    void add();
}
