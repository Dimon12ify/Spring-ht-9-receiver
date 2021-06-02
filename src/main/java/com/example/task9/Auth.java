package com.example.task9;

import java.io.Serializable;

@lombok.Data
public class Auth implements Serializable {
    private long Id;
    private String Name;
    private String Password;
    private String PhoneNumber;

    public Auth(long id, String name, String password , String phoneNumber) {
        Id = id;
        Name = name;
        Password = password;
        PhoneNumber = phoneNumber;
    }
}
