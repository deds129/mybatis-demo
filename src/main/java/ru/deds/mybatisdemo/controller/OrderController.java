package ru.deds.mybatisdemo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.deds.mybatisdemo.mapper.OrderMapper;
import ru.deds.mybatisdemo.model.Order;

import java.util.List;

@RestController
@RequestMapping(path="/api/orders", produces="application/json")
@RequiredArgsConstructor
public class OrderController {

    private final OrderMapper orderMapper;

    @GetMapping("{id}")
    public Order getOrderById(@PathVariable("id") Long id) {
        return orderMapper.findOrderById(id);
    }

    @GetMapping()
    public List<Order> getAllOrders() {
        return orderMapper.findAllOrders();
    }

    @PostMapping()
    public void addOrder(@RequestBody Order order) {
        orderMapper.insertOrder(order);
    }

    @DeleteMapping("{id}")
    public void deleteOrderById(@PathVariable("id") Long id) {
        orderMapper.deleteOrderById(id);
    }

}
