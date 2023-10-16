package ru.deds.mybatisdemo.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.deds.mybatisdemo.model.Order;

@RestController("/batis-api/orders")
public class OrderController {
    
    @GetMapping("{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return null;
    }

    @GetMapping()
    public Order getAllOrders(){
        return null;
    }

    @PostMapping()
    public Order addOrder(@RequestBody Order order){
        return null;
    }

    @DeleteMapping()
    public Order deleteOrderById(@PathVariable("id") Long id){
        return null;
    }
    
}
