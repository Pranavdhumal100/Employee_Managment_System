package com.example.api_gateway;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.*;
import org.springframework.cloud.gateway.route.builder.*;
import org.springframework.context.annotation.*;

@Configuration
public class ApiConfig {

    @Autowired
    private JwtAuthFilter jwtAuthFilter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {

        return builder.routes()

                
                .route("user-service", r -> r
                        .path("/auth/**")
                        .uri("lb://USER-SERVICE"))

                
                .route("order-service", r -> r
                        .path("/orders/**")
                        .filters(f -> f.filter(jwtAuthFilter))
                        .uri("lb://ORDER-SERVICE"))

                .build();
    }
}