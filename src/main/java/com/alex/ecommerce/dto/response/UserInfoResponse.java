package com.alex.ecommerce.dto.response;

import com.alex.ecommerce.domain.Order;
import com.alex.ecommerce.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Page;

@Data
@AllArgsConstructor
public class UserInfoResponse {
    private User user;
    private Page<Order> orders;
}
