package com.smallyang.architecture.adapter.in.web.controller;

import com.smallyang.architecture.application.port.in.CrossUseCase;
import com.smallyang.architecture.application.port.in.CustomerUseCase2;
import org.springframework.stereotype.Controller;

/**
 * @author USER
 * @date 2024-07-18 下午 11:20
 */
@Controller
public class CrossController {
    public CrossController(CrossUseCase c, CustomerUseCase2 c2) {
        this.c = c;
        this.c2 = c2;
    }

    private final CrossUseCase c;
    private final CustomerUseCase2 c2;

    @GetMapping()
    public void dxd(){
        c.ming();
    }

    @GetMapping()
    public void dxd1(){
        c2.ming();
    }
}
