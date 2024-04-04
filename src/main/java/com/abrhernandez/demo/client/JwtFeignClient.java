package com.abrhernandez.demo.client;

import com.abrhernandez.demo.model.User;
import com.abrhernandez.demo.model.ValidTokenRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "JTW-SERVICE", url = "${application.security.jwt.base-url}")
public interface JwtFeignClient {

    @PostMapping(value = "/check", consumes = MediaType.APPLICATION_JSON_VALUE)
    User isValidToken(ValidTokenRequest request);
}
