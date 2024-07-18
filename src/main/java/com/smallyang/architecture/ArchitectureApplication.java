package com.smallyang.architecture;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * 由adapter進入點，然後呼叫port介面， 由domain實作port的介面處理
 * 如果有引入兩個domain，由application 的 service去實作引入的部分
 *
 */
@SpringBootApplication
public class ArchitectureApplication {
    public static void main(String[] args) {
        SpringApplication.run(ArchitectureApplication.class, args);
    }
}
