package com.alex.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
class CustomErrorController implements com.alex.ecommerce.configuration.CustomErrorController { //TODO Плохая практика дават ьодинаковые имена. Добавьте Impl к имени класса

    @RequestMapping("/error")
    @Override
    public String handleError(HttpServletRequest request) {
        // Your error handling logic here
        return "error"; // Return the name of your error view
    }

    @Override
    public String getErrorPath() {
        return null; // Return null as the method is deprecated
    }
}


