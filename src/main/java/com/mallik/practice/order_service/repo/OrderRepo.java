package com.mallik.practice.order_service.repo;

import com.mallik.practice.order_service.entity.OrderJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<OrderJPAEntity, Long> {
    public List<OrderJPAEntity> findAllByOrderedBy(String name);
}
