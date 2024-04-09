package com.alex.ecommerce.configuration;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

public interface CustomErrorController extends ErrorController {
    @RequestMapping("/error")
    String handleError(HttpServletRequest request);

    String getErrorPath();
}
