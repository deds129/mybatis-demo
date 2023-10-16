package ru.deds.mybatisdemo.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.deds.mybatisdemo.model.Order;
import ru.deds.mybatisdemo.model.User;

@RestController("/batis-api/orders")
public class OrderController {
    
    @GetMapping("{id}")
    public User getOrderById(@PathVariable("id") Long id){
        return null;
    }

    @GetMapping()
    public User getAllOrders(){
        return null;
    }

    @PostMapping()
    public User addOrder(@RequestBody Order order){
        return null;
    }

    @DeleteMapping()
    public User deleteOrderById(@PathVariable("id") Long id){
        return null;
    }
    
}
