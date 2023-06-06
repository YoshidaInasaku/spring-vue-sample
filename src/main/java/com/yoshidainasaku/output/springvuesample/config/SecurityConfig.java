package com.yoshidainasaku.output.springvuesample.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // Todo: 処理の実装
        // 今のところはSpring Securityの無効化を行っている
        http.authorizeHttpRequests(authz -> authz
                .anyRequest().permitAll());
        return http.build();
    }
}
