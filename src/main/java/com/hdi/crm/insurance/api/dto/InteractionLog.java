package com.hdi.crm.insurance.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * Dados de Interação dentro de uma Apólice de Seguros (Agenda)
 */
@ApiModel(description = "Dados de Interação dentro de uma Apólice de Seguros (Agenda)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class InteractionLog implements ResponseDto{
    @JsonProperty("creationDateTime")
    private OffsetDateTime creationDateTime = null;

    @JsonProperty("user")
    private User user = null;

    @JsonProperty("idClaim")
    private Long idClaim = null;

    @JsonProperty("reason")
    private DomainData reason = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("classification")
    private DomainData classification = null;

    @JsonProperty("protocolCode")
    private String protocolCode = null;

    public InteractionLog creationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
        return this;
    }

    /**
     * Data e hora do registro da interação no formato YYYY-MM-DDtHH:MM:SSz em UTC. Ex.: 2018-11-14T13:29:36.000+0000
     *
     * @return creationDateTime
     **/
    @ApiModelProperty(value = "Data e hora do registro da interação no formato YYYY-MM-DDtHH:MM:SSz em UTC. Ex.: 2018-11-14T13:29:36.000+0000")

    @Valid

    public OffsetDateTime getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(OffsetDateTime creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public InteractionLog user(User user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     *
     * @return user
     **/
    @ApiModelProperty(value = "")

    @Valid

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public InteractionLog idClaim(Long idClaim) {
        this.idClaim = idClaim;
        return this;
    }

    /**
     * Código do Sinistro, caso esteja vinculado a algum
     *
     * @return idClaim
     **/
    @ApiModelProperty(value = "Código do Sinistro, caso esteja vinculado a algum")


    public Long getIdClaim() {
        return idClaim;
    }

    public void setIdClaim(Long idClaim) {
        this.idClaim = idClaim;
    }

    public InteractionLog reason(DomainData reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get reason
     *
     * @return reason
     **/
    @ApiModelProperty(value = "")

    @Valid

    public DomainData getReason() {
        return reason;
    }

    public void setReason(DomainData reason) {
        this.reason = reason;
    }

    public InteractionLog description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Texto descritivo da interação
     *
     * @return description
     **/
    @ApiModelProperty(value = "Texto descritivo da interação")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public InteractionLog classification(DomainData classification) {
        this.classification = classification;
        return this;
    }

    /**
     * Get classification
     *
     * @return classification
     **/
    @ApiModelProperty(value = "")

    @Valid

    public DomainData getClassification() {
        return classification;
    }

    public void setClassification(DomainData classification) {
        this.classification = classification;
    }

    public InteractionLog protocolCode(String protocolCode) {
        this.protocolCode = protocolCode;
        return this;
    }

    /**
     * Código de protocolo, caso o atendimento esteja vinculado a algum serviço que possua
     *
     * @return protocolCode
     **/
    @ApiModelProperty(value = "Código de protocolo, caso o atendimento esteja vinculado a algum serviço que possua")


    public String getProtocolCode() {
        return protocolCode;
    }

    public void setProtocolCode(String protocolCode) {
        this.protocolCode = protocolCode;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteractionLog interactionLog = (InteractionLog) o;
        return Objects.equals(this.creationDateTime, interactionLog.creationDateTime) &&
                Objects.equals(this.user, interactionLog.user) &&
                Objects.equals(this.idClaim, interactionLog.idClaim) &&
                Objects.equals(this.reason, interactionLog.reason) &&
                Objects.equals(this.description, interactionLog.description) &&
                Objects.equals(this.classification, interactionLog.classification) &&
                Objects.equals(this.protocolCode, interactionLog.protocolCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creationDateTime, user, idClaim, reason, description, classification, protocolCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteractionLog {\n");

        sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    idClaim: ").append(toIndentedString(idClaim)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
        sb.append("    protocolCode: ").append(toIndentedString(protocolCode)).append("\n");
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

