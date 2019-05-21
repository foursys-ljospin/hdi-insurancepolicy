package com.hdi.crm.insurance.dao;

import com.hdi.crm.insurance.api.dto.InsurancePolicyPayments;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InsurancePaymentsMapExtractor implements ResultSetExtractor<List<InsurancePolicyPayments>> {

    @Override
    public List<InsurancePolicyPayments> extractData(ResultSet resultSet) throws SQLException {
        List<InsurancePolicyPayments> payments = new ArrayList<>();
        while (resultSet.next()) {
            InsurancePolicyPayments payment = new InsurancePolicyPayments();

            payments.add(payment);

        }
        return payments;
    }
}
