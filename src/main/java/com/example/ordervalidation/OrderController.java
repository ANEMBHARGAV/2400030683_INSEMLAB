package com.example.ordervalidation;

import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @PostMapping
    public String createOrder(@Valid @RequestBody OrderRequest order) {
        return "Order created successfully";
    }
}