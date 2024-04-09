package com.alex.ecommerce.service;

import com.alex.ecommerce.dto.request.PasswordResetRequest;
import com.alex.ecommerce.dto.response.MessageResponse;

public interface AuthenticationService {

    MessageResponse sendPasswordResetCode(String email);

    String getEmailByPasswordResetCode(String code);

    MessageResponse resetPassword(PasswordResetRequest request);
}
