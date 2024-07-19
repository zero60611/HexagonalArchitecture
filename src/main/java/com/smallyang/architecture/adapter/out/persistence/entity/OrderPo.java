package com.smallyang.architecture.adapter.out.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author USER
 * @date 2024-07-18 下午 11:47
 */
@Entity
@Data
public class OrderPo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
}
