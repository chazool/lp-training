package com.virtusa.common;

import lombok.Data;

@Data
public class ErrorResponse {

    private String error;
    private String timeStamp;
    private String status;
    private Object message;
    private String path;


}