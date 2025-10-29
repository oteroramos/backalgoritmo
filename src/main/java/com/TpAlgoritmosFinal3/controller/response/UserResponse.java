package com.TpAlgoritmosFinal3.controller.response;

import com.TpAlgoritmosFinal3.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.Optional;

@Data
@AllArgsConstructor
@Builder
public class UserResponse {
    private String email;
    private String pass;
    private String rol;

    public static UserResponse fromUser(User user){
        return UserResponse.builder()
                .email(user.getEmail())
                .pass(user.getPassword())
                .rol(user.getRol())
                .build();
    }

}
