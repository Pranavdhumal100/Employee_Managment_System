package com.example.order_service;

import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PostMapping
    public Order createOrder(@RequestBody Order order, Principal principal) {

        if (principal == null) {
            throw new RuntimeException("Unauthorized");
        }

        String username = principal.getName();

        order.setUsername(username);

        return orderRepository.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @GetMapping("/my")
    public List<Order> getMyOrders(Principal principal) {

        String username = principal.getName();

        return orderRepository.findByUsername(username);
    }
}