package com.alex.ecommerce.service;

import com.alex.ecommerce.domain.Order;
import com.alex.ecommerce.domain.User;
import com.alex.ecommerce.dto.request.ChangePasswordRequest;
import com.alex.ecommerce.dto.request.EditUserRequest;
import com.alex.ecommerce.dto.request.SearchRequest;
import com.alex.ecommerce.dto.response.MessageResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User getAuthenticatedUser();

    Page<Order> searchUserOrders(SearchRequest request, Pageable pageable);

    MessageResponse editUserInfo(EditUserRequest request);

    MessageResponse changePassword(ChangePasswordRequest request);
}
