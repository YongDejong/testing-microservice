package com.app.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http/*, AppFilter appFilter*/) throws Exception {

        http
                // REST API: Stateless session
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                // REST API: Disable CSRF (using JWT later)
                .csrf(AbstractHttpConfigurer::disable)
                // Add JWT filter before UsernamePasswordAuthenticationFilter
//                .addFilterBefore(appFilter, UsernamePasswordAuthenticationFilter.class)

                .authorizeHttpRequests(auth -> auth
                        // Public endpoints
                        .requestMatchers("/", "/hello","/getCustomer", "/debug").permitAll()
                        // Private endpoints
//                        .requestMatchers().authenticated()
                        // Any other request
                        .anyRequest().authenticated()
                )
                .formLogin(AbstractHttpConfigurer::disable)
                .httpBasic(AbstractHttpConfigurer::disable);
        return http.build();
    }
}
