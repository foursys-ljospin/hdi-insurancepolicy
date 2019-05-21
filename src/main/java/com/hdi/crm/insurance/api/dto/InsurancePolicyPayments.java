package com.hdi.crm.insurance.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Dados de pagamento das parcelas da Apólice de Seguro
 */
@ApiModel(description = "Dados de pagamento das parcelas da Apólice de Seguro")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class InsurancePolicyPayments {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("number")
    private Integer number = null;

    @JsonProperty("creationDate")
    private LocalDate creationDate = null;

    @JsonProperty("amount")
    private Float amount = null;

    @JsonProperty("amountPaid")
    private Float amountPaid = null;

    @JsonProperty("currency")
    private String currency = null;

    @JsonProperty("dueDate")
    private LocalDate dueDate = null;

    @JsonProperty("paymentDate")
    private LocalDate paymentDate = null;

    @JsonProperty("paymentType")
    private PaymentType paymentType = null;

    @JsonProperty("status")
    private Status status = null;

    public InsurancePolicyPayments id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Id da Apólice
     *
     * @return id
     **/
    @ApiModelProperty(value = "Id da Apólice")


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public InsurancePolicyPayments number(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * Número da parcela
     *
     * @return number
     **/
    @ApiModelProperty(value = "Número da parcela")


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public InsurancePolicyPayments creationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * creation Date
     *
     * @return creationDate
     **/
    @ApiModelProperty(value = "creation Date")

    @Valid

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public InsurancePolicyPayments amount(Float amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Valor da parcela
     *
     * @return amount
     **/
    @ApiModelProperty(value = "Valor da parcela")


    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public InsurancePolicyPayments amountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    /**
     * Valor da pago
     *
     * @return amountPaid
     **/
    @ApiModelProperty(value = "Valor da pago")


    public Float getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Float amountPaid) {
        this.amountPaid = amountPaid;
    }

    public InsurancePolicyPayments currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Moeda. Ex.: R$, US$
     *
     * @return currency
     **/
    @ApiModelProperty(value = "Moeda. Ex.: R$, US$")


    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public InsurancePolicyPayments dueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Data de vencimento no formato YYYY-MM-DD. Ex.: 2018-11-14
     *
     * @return dueDate
     **/
    @ApiModelProperty(value = "Data de vencimento no formato YYYY-MM-DD. Ex.: 2018-11-14")

    @Valid

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public InsurancePolicyPayments paymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
        return this;
    }

    /**
     * Data do pagamento no formato YYYY-MM-DD. Ex.: 2018-11-14
     *
     * @return paymentDate
     **/
    @ApiModelProperty(value = "Data do pagamento no formato YYYY-MM-DD. Ex.: 2018-11-14")

    @Valid

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public InsurancePolicyPayments paymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Get paymentType
     *
     * @return paymentType
     **/
    @ApiModelProperty(value = "")

    @Valid

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public InsurancePolicyPayments status(Status status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")

    @Valid

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsurancePolicyPayments insurancePolicyPayments = (InsurancePolicyPayments) o;
        return Objects.equals(this.id, insurancePolicyPayments.id) &&
                Objects.equals(this.number, insurancePolicyPayments.number) &&
                Objects.equals(this.creationDate, insurancePolicyPayments.creationDate) &&
                Objects.equals(this.amount, insurancePolicyPayments.amount) &&
                Objects.equals(this.amountPaid, insurancePolicyPayments.amountPaid) &&
                Objects.equals(this.currency, insurancePolicyPayments.currency) &&
                Objects.equals(this.dueDate, insurancePolicyPayments.dueDate) &&
                Objects.equals(this.paymentDate, insurancePolicyPayments.paymentDate) &&
                Objects.equals(this.paymentType, insurancePolicyPayments.paymentType) &&
                Objects.equals(this.status, insurancePolicyPayments.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, creationDate, amount, amountPaid, currency, dueDate, paymentDate, paymentType, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsurancePolicyPayments {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    paymentDate: ").append(toIndentedString(paymentDate)).append("\n");
        sb.append("    paymentType: ").append(toIndentedString(paymentType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

