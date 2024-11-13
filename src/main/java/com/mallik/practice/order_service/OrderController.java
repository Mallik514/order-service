package com.mallik.practice.order_service;

import com.mallik.practice.order_service.entity.OrderJPAEntity;
import com.mallik.practice.order_service.repo.OrderRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderRepo orderRepo;

    public OrderController(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Transactional
    @PostMapping("/")
    public ResponseEntity<Void> placeOrder(@RequestBody OrderPojo order) {
        //make an entry into orders table
        OrderJPAEntity orderJPAEntity = new OrderJPAEntity();
        BeanUtils.copyProperties(order,orderJPAEntity);
        orderRepo.save(orderJPAEntity);
        //decrease quantity in inventory
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @GetMapping("/")
    public List<OrderJPAEntity> getAllOrdersOfACustomer(@RequestParam("name") String name){
        return orderRepo.findAllByOrderedBy(name);
    }
}
