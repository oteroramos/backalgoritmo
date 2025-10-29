package com.TpAlgoritmosFinal3.service.imp;

import com.TpAlgoritmosFinal3.controller.request.UserRequest;
import com.TpAlgoritmosFinal3.controller.response.UserResponse;
import com.TpAlgoritmosFinal3.repository.UserRepository;
import com.TpAlgoritmosFinal3.service.UserServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService implements UserServiceImp {

    private UserRepository userRepository;

    public Optional<UserResponse> login(UserRequest userRequest){
        System.out.println("LOGGUEADO KLASJDL;ASKJD");
        return userRepository.findByEmail(userRequest.getEmail())
                .filter(user -> user.getPassword().equals(userRequest.getPassword()))
                .map(UserResponse::fromUser);
    }
}
