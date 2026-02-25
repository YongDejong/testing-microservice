//package com.app.api.filter;
//
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.lang.NonNull;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class AppFilter extends OncePerRequestFilter {
//
//    @Override
//    protected void doFilterInternal(
//            @NonNull HttpServletRequest request,
//            @NonNull HttpServletResponse response,
//            @NonNull FilterChain filterChain
//    ) throws ServletException, IOException {
//
//        final String authHeader = request.getHeader("Authorization");
//
//        // 1. Check if Authorization header exists and starts with "Bearer "
//        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
//            // No token present, continue the filter chain
//            // (Spring Security will reject if the endpoint requires auth)
//            filterChain.doFilter(request, response);
//            return;
//        }
//
//        // 2. Extract token
//        final String jwt = authHeader.substring(7);
//
//        // TODO: Implement JWT validation here
//        // if (jwtService.validate(jwt)) {
//        //     UsernamePasswordAuthenticationToken authToken = ...
//        //     SecurityContextHolder.getContext().setAuthentication(authToken);
//        // }
//
//        System.out.println("Processing request with token: " + jwt); // Debug only
//
//        filterChain.doFilter(request, response);
//    }
//}
//
