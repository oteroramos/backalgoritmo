package com.TpAlgoritmosFinal3.model;


import com.TpAlgoritmosFinal3.controller.request.UserRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuarios;

    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String nacimiento;
    private String telefono;
    private String email;
    private String password;

    public static User toUser(UserRequest userRequest) {
        return User.builder()
                .nombre(userRequest.getNombre())
                .apellido(userRequest.getApellido())
                .dni(userRequest.getDni())
                .direccion(userRequest.getDireccion())
                .nacimiento(userRequest.getNacimiento())
                .telefono(userRequest.getTelefono())
                .email(userRequest.getEmail())
                .password(userRequest.getPassword())
                .build();
    }
}
