package com.hdi.crm.insurance.util;

public enum StatusEnum {

        PAID_ON_TIME(1, "Pago em Dia"),
        DELAYED_PAYMENT(2, "Pago em Atraso"),
        OPENED(3, "Em Aberto"),
        EXPIRED(4, "Vencido");

    private Integer id;
    private String description;

    StatusEnum(Integer id, String description) {
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public Integer getId() {
        return this.id;
    }

    public static StatusEnum getByDescription(String text) {
        if(text != null) {
            for (StatusEnum status : StatusEnum.values()) {
                if (status.getDescription().equals(text)) {
                    return status;
                }
            }
        }
        return null;
    }
}
