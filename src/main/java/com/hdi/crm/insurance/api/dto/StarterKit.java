package com.hdi.crm.insurance.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * StarterKit
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-05-20T20:43:56.051Z")

public class StarterKit {
    @JsonProperty("contacts")
    @Valid
    private List<Contact> contacts = null;

    public StarterKit contacts(List<Contact> contacts) {
        this.contacts = contacts;
        return this;
    }

    public StarterKit addContactsItem(Contact contactsItem) {
        if (this.contacts == null) {
            this.contacts = new ArrayList<Contact>();
        }
        this.contacts.add(contactsItem);
        return this;
    }

    /**
     * Get contacts
     *
     * @return contacts
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StarterKit starterKit = (StarterKit) o;
        return Objects.equals(this.contacts, starterKit.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contacts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StarterKit {\n");

        sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

