package com.hdi.crm.insurance.util;


public enum PaymentTypeEnum {
    DEBIT_ACCOUNT(1, "Debito em conta"),
    TICKET_WITHOUT_REGISTRATION(2, "Boleto sem registro"),
    TICKET_WITH_REGISTRATION(3, "Boleto com registro"),
    CREDIT_CARD(4, "Cartao de credito"),
    TICKET_OCT(5, "Boleto OCT"),
    OCT_PREPAID_TICKET(6, "OCT - Boleto parcela antecipada");

    private Integer id;
    private String description;

    PaymentTypeEnum(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public static PaymentTypeEnum getByDescription(String text) {
        if (text != null) {
            for (PaymentTypeEnum payment : PaymentTypeEnum.values()) {
                if (payment.getDescription().equals(text)) {
                    return payment;
                }
            }
        }
        return null;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return this.id;
    }
}
