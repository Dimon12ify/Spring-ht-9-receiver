package com.example.task9;

import java.io.Serializable;
import java.sql.Time;
import java.time.LocalDateTime;

@lombok.Data
public class ValidAuth implements Serializable {
    private long Id;

    public ValidAuth(long id, String state, LocalDateTime time, String message) {
        Id = id;
        State = state;
        Time = time;
        Message = message;
    }

    private String State;
    private LocalDateTime Time;
    private String Message;

}
