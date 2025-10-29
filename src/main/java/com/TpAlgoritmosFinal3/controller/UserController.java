package com.TpAlgoritmosFinal3.controller;

import com.TpAlgoritmosFinal3.controller.request.UserRequest;
import com.TpAlgoritmosFinal3.controller.response.UserResponse;
import com.TpAlgoritmosFinal3.service.UserServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class UserController {

    private UserServiceImp userServiceImp;

    @PostMapping("/login")
    public ResponseEntity<Optional<UserResponse>> login(@RequestBody UserRequest userRequest) {
        return ResponseEntity.ok(userServiceImp.login(userRequest));
    }
}
