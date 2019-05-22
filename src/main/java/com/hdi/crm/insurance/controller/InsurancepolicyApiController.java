package com.hdi.crm.insurance.controller;

import com.hdi.crm.insurance.api.ApiException;
import com.hdi.crm.insurance.api.InsurancepolicyApi;
import com.hdi.crm.insurance.api.dto.ResponseDto;
import com.hdi.crm.insurance.service.InsuranceService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

@Controller
public class InsurancepolicyApiController implements InsurancepolicyApi {

    private static final Logger log = LoggerFactory.getLogger(InsurancepolicyApiController.class);

    private final HttpServletRequest request;

    private InsuranceService insuranceService;

    @Autowired
    public InsurancepolicyApiController(HttpServletRequest request) {
        this.request = request;
    }

    @Autowired
    public void setInsuranceService(InsuranceService insuranceService) {
        this.insuranceService = insuranceService;
    }

    public ResponseEntity getPayments(
            @ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId,
            @ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId,
            @ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId,
            @ApiParam(value = "ID da Apólice de Seguro", required = true) @PathVariable("idInsurancePolicy") Long idInsurancePolicy,
            @Min(0) @ApiParam(value = "Number of start record.") @Valid @RequestParam(value = "skip", required = false) Integer skip,
            @Min(1) @Max(100) @ApiParam(value = "Quantity of records", defaultValue = "20") @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") Integer limit,
            @ApiParam(value = "Fields list to return data") @Valid @RequestParam(value = "fieldsFilter", required = false) String fieldsFilter) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return insuranceService.getPayments(idInsurancePolicy, xCompanyId, xApplicationId, xUserId);
            } catch (ApiException e) {
                log.error(e.getMessage(), e);
                return new ResponseEntity<>(e.getApiReponseError(), HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ResponseDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity getInteractionLog(@ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId, @ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId, @ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId, @ApiParam(value = "ID da Apólice de Seguro", required = true) @PathVariable("idInsurancePolicy") Long idInsurancePolicy, @Min(0) @ApiParam(value = "Number of start record.") @Valid @RequestParam(value = "skip", required = false) Integer skip, @Min(1) @Max(100) @ApiParam(value = "Quantity of records", defaultValue = "20") @Valid @RequestParam(value = "limit", required = false, defaultValue = "20") Integer limit, @ApiParam(value = "Fields list to return data") @Valid @RequestParam(value = "fieldsFilter", required = false) String fieldsFilter) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return insuranceService.getInteractionLog(idInsurancePolicy, xCompanyId, xApplicationId, xUserId);
            } catch (ApiException e) {
                log.error(e.getMessage(), e);
                return new ResponseEntity<>(e.getApiReponseError(), HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ResponseDto>>(HttpStatus.NOT_IMPLEMENTED);
    }

//    public ResponseEntity<List<InsurancePdf>> getInsuranePolicyInvoce(@ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId, @ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId, @ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId, @ApiParam(value = "ID da Apólice de Seguro", required = true) @PathVariable("idInsurancePolicy") Integer idInsurancePolicy, @ApiParam(value = "Number of part invoce") @Valid @RequestParam(value = "InvoicePart", required = false) Integer invoicePart) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<List<InsurancePdf>>(objectMapper.readValue("[ {  \"pdf\" : {    \"binary\" : \"binary\"  }}, {  \"pdf\" : {    \"binary\" : \"binary\"  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<List<InsurancePdf>>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<List<InsurancePdf>>(HttpStatus.NOT_IMPLEMENTED);
//    }

//    public ResponseEntity<Void> getInsuranePolicyInvoceEmail(@ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId, @ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId, @ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId, @ApiParam(value = "ID da Apólice de Seguro", required = true) @PathVariable("idInsurancePolicy") Long idInsurancePolicy) {
//        String accept = request.getHeader("Accept");
//        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//    public ResponseEntity<Void> pOSTStarterKit(@ApiParam(value = "Company ID", required = true) @RequestHeader(value = "X-Company-Id", required = true) String xCompanyId, @ApiParam(value = "Application ID", required = true) @RequestHeader(value = "X-Application-Id", required = true) String xApplicationId, @ApiParam(value = "User ID", required = true) @RequestHeader(value = "X-User-Id", required = true) String xUserId, @ApiParam(value = "ID da Apólice de Seguro", required = true) @PathVariable("idInsurancePolicy") Long idInsurancePolicy, @ApiParam(value = "Contacts Entity", required = true) @Valid @RequestBody StarterKit contacts) {
//        String accept = request.getHeader("Accept");
//        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
//    }

}
