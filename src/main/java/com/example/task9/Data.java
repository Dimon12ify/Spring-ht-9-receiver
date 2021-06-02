package com.example.task9;

import java.io.Serializable;

@lombok.Data
public class Data implements Serializable {
    private long Id;
    private String Name;
    private String PhoneNumber;

    public Data(long id, String name, String phoneNumber) {
        Id = id;
        Name = name;
        PhoneNumber = phoneNumber;
    }
}
