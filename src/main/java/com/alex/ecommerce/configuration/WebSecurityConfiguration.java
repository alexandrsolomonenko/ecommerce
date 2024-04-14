package com.alex.ecommerce.configuration;

import com.alex.ecommerce.security.UserDetailsServiceImpl;
import com.alex.ecommerce.service.impl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.DefaultSecurityFilterChain;

import java.util.Objects;

// TODO устаревший подход, много deprecated
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfiguration extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {

    private final UserServiceImpl userService;
    private final UserDetailsServiceImpl userDetailsService;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers("/",
                        "/registration/**",
                        "/user/contacts",
                        "/img/**",
                        "/static/**",
                        "/auth/**",
                        "/menu/**",
                        "/perfume/**"
                ).permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/user/account")
                .permitAll()
                .and()
                .logout()
                .permitAll()
                .and().csrf().disable();
    }

    // TODO сократите количество кода с помощью Lombok
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WebSecurityConfiguration that = (WebSecurityConfiguration) o;

        if (!Objects.equals(userService, that.userService)) return false;
        if (!Objects.equals(userDetailsService, that.userDetailsService))
            return false;
        return Objects.equals(passwordEncoder, that.passwordEncoder);
    }

    @Override
    public int hashCode() {
        int result = userService != null ? userService.hashCode() : 0;
        result = 31 * result + (userDetailsService != null ? userDetailsService.hashCode() : 0);
        result = 31 * result + (passwordEncoder != null ? passwordEncoder.hashCode() : 0);
        return result;
    }
}
