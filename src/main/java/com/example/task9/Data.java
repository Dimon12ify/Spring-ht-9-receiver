package com.example.task9;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@lombok.Data
public class Data implements Serializable {
    @Min(1)
    private long Id;

    @NotBlank(message = "Name is mandatory")
    private String Name;

    @NotBlank(message = "Phone is mandatory")
    @Pattern(regexp = "\\d*", message = "Phone must be numbers only")
    private String PhoneNumber;

    public Data(long id, String name, String phoneNumber) {
        Id = id;
        Name = name;
        PhoneNumber = phoneNumber;
    }
}
