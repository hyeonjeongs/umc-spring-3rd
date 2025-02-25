package com.umc.umcserver.global.dto;

import lombok.Data;

@Data
public class DtoMetaData {
    private String message;
    private String exception;

    public DtoMetaData(String message) {
        this.message = message;
        this.exception = null;
    }

    public DtoMetaData(String message, String exception) {
        this.message = message;
        this.exception = exception;
    }
}
