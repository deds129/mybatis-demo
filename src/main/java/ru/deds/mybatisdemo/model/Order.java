package ru.deds.mybatisdemo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order {
    
    private Long id;
    private Long userId;
    private String name;
    private String comment;
    private BigDecimal price;
    private LocalDateTime date;
    
}
