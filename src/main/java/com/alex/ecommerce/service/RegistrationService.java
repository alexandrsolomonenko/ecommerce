package com.alex.ecommerce.service;

import com.alex.ecommerce.dto.response.MessageResponse;
import com.alex.ecommerce.dto.request.UserRequest;

public interface RegistrationService {

    MessageResponse registration(String captchaResponse, UserRequest user);

    MessageResponse activateEmailCode(String code);
}
