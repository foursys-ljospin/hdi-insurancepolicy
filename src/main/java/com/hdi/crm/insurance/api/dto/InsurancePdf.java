package com.hdi.crm.insurance.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Pattern;
import java.util.Objects;

/**
 * PDF Entity
 */
@ApiModel(description = "PDF Entity")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class InsurancePdf implements ResponseDto{
    @JsonProperty("binary")
    private byte[] binary = null;

    public InsurancePdf binary(byte[] binary) {
        this.binary = binary;
        return this;
    }

    /**
     * Get binary
     *
     * @return binary
     **/
    @ApiModelProperty(value = "")

    @Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")
    public byte[] getBinary() {
        return binary;
    }

    public void setBinary(byte[] binary) {
        this.binary = binary;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InsurancePdf insurancePDFPdf = (InsurancePdf) o;
        return Objects.equals(this.binary, insurancePDFPdf.binary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InsurancePDFPdf {\n");

        sb.append("    binary: ").append(toIndentedString(binary)).append("\n");
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

