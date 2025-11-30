package com.TpAlgoritmosFinal3.controller.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRequest {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String nacimiento;
    private String telefono;
    private String email;
    private String password;
}
