package com.hdi.crm.insurance.api;

import com.hdi.crm.insurance.api.dto.Error;

import java.util.ArrayList;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class NotFoundException extends ApiException {
    private int code;

    public NotFoundException(int code, String msg) {
        super(code, msg, new ArrayList<Error>());
        this.code = code;
    }
}
