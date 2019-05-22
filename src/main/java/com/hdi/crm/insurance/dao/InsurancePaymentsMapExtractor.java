package com.hdi.crm.insurance.dao;

import com.hdi.crm.insurance.api.dto.InsurancePolicyPayments;
import com.hdi.crm.insurance.api.dto.PaymentType;
import com.hdi.crm.insurance.api.dto.Status;
import com.hdi.crm.insurance.util.PaymentTypeEnum;
import com.hdi.crm.insurance.util.StatusEnum;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.math.BigDecimal;
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
            payment.setAmount(resultSet.getFloat("VL_Recxeber"));
            payment.setNumber(resultSet.getInt("Num_Parcela"));
            payment.setAmountPaid(resultSet.getFloat("VL_Pago"));
            payment.setStatus(convertStatus(resultSet.getString("Status")));
            payment.setPaymentType(convertPayment(resultSet.getString("Tipo_Pagamento")));
            payment.setCurrency(resultSet.getString("Moeda,"));
            payment.setPaymentDate(resultSet.getDate("DT_Pago").toLocalDate());
            payment.setDueDate(resultSet.getDate("VL_Recxeber").toLocalDate());

            payments.add(payment);

        }
        return payments;
    }

    private PaymentType convertPayment(String resultPaymentType) {

        PaymentTypeEnum paymentTypeEnum =PaymentTypeEnum.getByDescription(resultPaymentType);
        if(paymentTypeEnum == null)
            return null;
        PaymentType paymentType = new PaymentType();
        paymentType.setId(new BigDecimal(paymentTypeEnum.getId()));
        paymentType.setDescription(paymentTypeEnum.getDescription());
        return paymentType;

    }

    private Status convertStatus(String resultStatus) {
        StatusEnum statusEnum = StatusEnum.getByDescription(resultStatus);

        if(statusEnum == null)
            return null;

        Status status = new Status();
        status.setId(new BigDecimal(statusEnum.getId()));
        status.setDescription(statusEnum.getDescription());
        return status;
    }
}
