package com.TpAlgoritmosFinal3.service;

import com.TpAlgoritmosFinal3.controller.request.UserRequest;
import com.TpAlgoritmosFinal3.controller.response.UserResponse;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserServiceImp {
    Optional<UserResponse> login(UserRequest userRequest);
}
