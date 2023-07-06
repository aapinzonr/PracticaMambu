package com.sofka.practicaMambu.domain.dto;

import java.util.Map;

public class ClientCreateResponseDTO {
    private String encodedKey;
    private String id;
    private String state;
    private String creationDate;
    private String lastModifiedDate;
    private String approvedDate;
    private String firstName;
    private String lastName;
    private String preferredLanguage;
    private String gender;
    private String clientRoleKey;
    private int loanCycle;
    private int groupLoanCycle;
    private String[] addresses;
    private String[] idDocuments;
    private Map<String,String> customFields;

    public String getEncodedKey() {
        return encodedKey;
    }

    public void setEncodedKey(String encodedKey) {
        this.encodedKey = encodedKey;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getApprovedDate() {
        return approvedDate;
    }

    public void setApprovedDate(String approvedDate) {
        this.approvedDate = approvedDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClientRoleKey() {
        return clientRoleKey;
    }

    public void setClientRoleKey(String clientRoleKey) {
        this.clientRoleKey = clientRoleKey;
    }

    public int getLoanCycle() {
        return loanCycle;
    }

    public void setLoanCycle(int loanCycle) {
        this.loanCycle = loanCycle;
    }

    public int getGroupLoanCycle() {
        return groupLoanCycle;
    }

    public void setGroupLoanCycle(int groupLoanCycle) {
        this.groupLoanCycle = groupLoanCycle;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public String[] getIdDocuments() {
        return idDocuments;
    }

    public void setIdDocuments(String[] idDocuments) {
        this.idDocuments = idDocuments;
    }

    public Map<String, String> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(Map<String, String> customFields) {
        this.customFields = customFields;
    }
}