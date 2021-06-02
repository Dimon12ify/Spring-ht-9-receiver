package com.example.task9;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class Auth implements Serializable {
    @NotBlank(message = "Name is mandatory")
    private String Name;

    @NotBlank(message = "Login is mandatory")
    private String Login;

    @NotBlank(message = "Password is mandatory")
    private String Password;

    @NotBlank(message = "Phone is mandatory")
    @Pattern(regexp = "\\d*", message = "Phone must be numbers only")
    private String PhoneNumber;

    public Auth(String name, String login , String password , String phoneNumber) {
        Name = name;
        Login = login;
        Password = password;
        PhoneNumber = phoneNumber;
    }
}
