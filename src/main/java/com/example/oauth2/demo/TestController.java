package com.example.oauth2.demo;

import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test/v1/oauth2")
public class TestController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<?> getGroups() throws Exception {

        // is null here
        SecurityContext securityContext = SecurityContextHolder.getContext();

        return ResponseEntity.ok("");
    }


}
