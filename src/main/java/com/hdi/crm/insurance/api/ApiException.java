package com.hdi.crm.insurance.api;

import com.hdi.crm.insurance.api.dto.ApiErrorResponse;
import com.hdi.crm.insurance.api.dto.Error;

import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class ApiException extends Exception {
    private int code;
    private ApiErrorResponse apiErrorResponse;

    public ApiException(int code, String msg, List<Error> error) {
        super(msg);
        this.code = code;
        populateErrorReponse(error);
    }

    public ApiErrorResponse getApiReponseError() {
        return apiErrorResponse;
    }

    private void populateErrorReponse(List<Error> error) {
        apiErrorResponse = new ApiErrorResponse();
        apiErrorResponse.setCode(Integer.valueOf(this.code));
        apiErrorResponse.setMessage(super.getMessage());
        apiErrorResponse.setDescription(super.getLocalizedMessage());
        apiErrorResponse.setErrors(error);
    }
}
