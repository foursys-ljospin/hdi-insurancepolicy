package com.hdi.crm.insurance.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Status payment. Ex.: (Payed on time, Late payment, Em Aberto, Expired)
 */
@ApiModel(description = "Status payment. Ex.: (Payed on time, Late payment, Em Aberto, Expired)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class Status {
    @JsonProperty("id")
    private BigDecimal id = null;

    @JsonProperty("description")
    private String description = null;

    public Status id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * Internal ID
     *
     * @return id
     **/
    @ApiModelProperty(value = "Internal ID")

    @Valid

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Status description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Status description
     *
     * @return description
     **/
    @ApiModelProperty(value = "Status description")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Status status = (Status) o;
        return Objects.equals(this.id, status.id) &&
                Objects.equals(this.description, status.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

