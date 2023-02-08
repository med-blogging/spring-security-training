package com.springsecurity.springsecuritytraining.security;

import com.springsecurity.springsecuritytraining.services.InMemoryUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

@Configuration
public class SecurityConfiguration {
    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails u = new SecurityUser("test", "1234", "read");
        return new InMemoryUserDetailsService(List.of(u));
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance(); }
}
