//package com.example.order_service.service;
//
//
//import com.example.order_service.model.Order;
//import com.example.order_service.repository.OrderRepository;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.time.LocalDateTime;
//
//@Service
//public class OrderService {
//
//    @Autowired
//    private OrderRepository orderRepository;
//
//    @Autowired
//    private ProductRepository productRepository;
//
//    @Transactional
//    public Order createOrder(Order order) {
//        Product product = productRepository.findById(order.getProductId())
//                .orElseThrow(() -> new RuntimeException("Product not found"));
//        if(product.getStockQuantity()<order.getQuantity()){
//            throw new IllegalArgumentException("Not enough stock available for product: "+product.getName());
//        }
//
//        product.setStockQuantity(product.getStockQuantity()-order.getQuantity());
//        productRepository.save(product);
//
//        order.setOrderDate(LocalDateTime.now());
//        order.setStatus("CREATED");
//        return orderRepository.save(order);
//
//    }
//
//    public Order updateOrder(Long id, Order order){
//        Order existingOrder = orderRepository.findById(id)
//                .orElseThrow(() -> new RuntimeException("Order not found"));
//        existingOrder.setQuantity(order.getQuantity());
//        existingOrder.setStatus(order.getStatus());
//        return orderRepository.save(existingOrder);
//    }
//}