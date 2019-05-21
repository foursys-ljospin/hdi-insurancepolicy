package com.hdi.crm.insurance.api.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Contacts Entity
 */
@ApiModel(description = "Contacts Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class Contact {
    @JsonProperty("type")
    private TypeEnum type = null;
    @JsonProperty("valor")
    private String valor = null;

    public Contact type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Contact Type
     *
     * @return type
     **/
    @ApiModelProperty(value = "Contact Type")


    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Contact valor(String valor) {
        this.valor = valor;
        return this;
    }

    /**
     * Contact Data
     *
     * @return valor
     **/
    @ApiModelProperty(value = "Contact Data")


    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Contact contact = (Contact) o;
        return Objects.equals(this.type, contact.type) &&
                Objects.equals(this.valor, contact.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, valor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Contact {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

    /**
     * Contact Type
     */
    public enum TypeEnum {
        E_MAIL("E-mail"),

        E_MAIL_PARA_SINISTRO("E-mail para Sinistro"),

        E_MAIL_PARA_NF("E-mail para NF"),

        E_MAIL_PARA_EXTRATO("E-mail para Extrato"),

        TELEFONE_RESIDENCIAL("Telefone Residencial"),

        TELEFONE_COMERCIAL("Telefone Comercial"),

        TELEFONE_CELULAR("Telefone Celular");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonCreator
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }
    }
}

