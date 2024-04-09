package com.alex.ecommerce.service;

import com.alex.ecommerce.domain.Order;
import com.alex.ecommerce.domain.Perfume;
import com.alex.ecommerce.domain.User;
import com.alex.ecommerce.dto.request.OrderRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {

    Order getOrder(Long orderId);

    List<Perfume> getOrdering();

    Page<Order> getUserOrdersList(Pageable pageable);

    Long postOrder(User user, OrderRequest orderRequest);
}
