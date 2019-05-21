package com.hdi.crm.insurance.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * Dados do Usuário
 */
@ApiModel(description = "Dados do Usuário")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class User {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("name")
    private String name = null;

    public User id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Identificador do usuário que está solicitando
     *
     * @return id
     **/
    @ApiModelProperty(value = "Identificador do usuário que está solicitando")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Nome do usuário que está solicitando
     *
     * @return name
     **/
    @ApiModelProperty(value = "Nome do usuário que está solicitando")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.id, user.id) &&
                Objects.equals(this.name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

