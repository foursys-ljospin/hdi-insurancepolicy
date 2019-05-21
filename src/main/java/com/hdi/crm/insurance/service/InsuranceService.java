package com.hdi.crm.insurance.service;

import com.hdi.crm.insurance.api.ApiException;
import com.hdi.crm.insurance.api.dto.InsurancePolicyPayments;
import com.hdi.crm.insurance.api.dto.InteractionLog;
import com.hdi.crm.insurance.dao.Dao;
import com.hdi.crm.insurance.dao.InsurancePaymentsDao;
import com.hdi.crm.insurance.dao.InteractionLogDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceService {

    @Autowired
    private InteractionLogDao interactionLogDao;
    @Autowired
    private InsurancePaymentsDao insurancePaymentsDao;




    public ResponseEntity<List<InsurancePolicyPayments>> getPayments(Long idInsurancePolicy, String xCompanyId, String xApplicationId, String xUserId) throws ApiException {
        try {
            List<InsurancePolicyPayments> payments = insurancePaymentsDao.get(idInsurancePolicy, xCompanyId, xApplicationId, xUserId);
            return new ResponseEntity<>(payments, HttpStatus.OK);
        } catch (RuntimeException  e) {
            throw new ApiException(12, "Not possible connect Payments service");
        }
    }

    public ResponseEntity<List<InteractionLog>> getInteractionLog(Long idInsurancePolicy, String xCompanyId, String xApplicationId, String xUserId) throws ApiException{
        try {
            List<InteractionLog> interations = interactionLogDao.get(idInsurancePolicy, xCompanyId, xApplicationId, xUserId);
            return new ResponseEntity<>(interations, HttpStatus.OK);
        } catch (RuntimeException  e) {
            throw new ApiException(12, "Not possible connect Payments service");
        }

    }
}
