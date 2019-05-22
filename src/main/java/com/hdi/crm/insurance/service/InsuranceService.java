package com.hdi.crm.insurance.service;

import com.hdi.crm.insurance.api.ApiException;
import com.hdi.crm.insurance.api.dto.Error;
import com.hdi.crm.insurance.api.dto.ResponseDto;
import com.hdi.crm.insurance.dao.InsurancePaymentsDao;
import com.hdi.crm.insurance.dao.InteractionLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InsuranceService {

    private InteractionLogDao interactionLogDao;
    private InsurancePaymentsDao insurancePaymentsDao;

    @Autowired
    public void setInteractionLogDao(InteractionLogDao interactionLogDao) {
        this.interactionLogDao = interactionLogDao;
    }

    @Autowired
    public void setInsurancePaymentsDao(InsurancePaymentsDao insurancePaymentsDao) {
        this.insurancePaymentsDao = insurancePaymentsDao;
    }


    public ResponseEntity<List<ResponseDto>> getPayments(Long idInsurancePolicy, String xCompanyId, String xApplicationId, String xUserId) throws ApiException {
        try {
            List<ResponseDto> payments = insurancePaymentsDao.get(idInsurancePolicy, xCompanyId, xApplicationId, xUserId);
            return new ResponseEntity<>(payments, HttpStatus.OK);
        } catch (RuntimeException e) {
            throw throwError(1, "Not possible get Payments service");
        }
    }

    public ResponseEntity<List<ResponseDto>> getInteractionLog(Long idInsurancePolicy, String xCompanyId, String xApplicationId, String xUserId) throws ApiException {
        try {
            List<ResponseDto> interations = interactionLogDao.get(idInsurancePolicy, xCompanyId, xApplicationId, xUserId);
            return new ResponseEntity<>(interations, HttpStatus.OK);
        } catch (RuntimeException e) {
            throw throwError(2, "Not possible get interaction log");
        }

    }

    private ApiException throwError(int code, String message) {
        Error error = new Error();
        error.setCode(code);
        error.setMessage(message);
        List<Error> errorsList = new ArrayList<>();
        errorsList.add(error);
        return new ApiException(code, error.getMessage(), errorsList);
    }
}
