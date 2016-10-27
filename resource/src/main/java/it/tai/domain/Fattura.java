package it.tai.domain;

import org.springframework.data.annotation.Id;

/**
 * Created by miche on 25/10/2016.
 */
public class Fattura {
    @Id
    public String id;

    public String firstName;
    public String lastName;
    public String company;
    public String taxCode;
    public String vatCode;
    public String address;
    public String municipality;
    public String province;
    public String phone;
    public String zipCode;
    public String birthday;
    public String username;
    public String password;
    public String email;

    public Fattura(){}

    public Fattura(String firstName, String lastName, String company, String taxCode, String vatCode, String address,
                   String municipality, String province, String phone, String zipCode, String birthday, String username,
                   String password, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.taxCode = taxCode;
        this.vatCode = vatCode;
        this.address = address;
        this.municipality = municipality;
        this.province = province;
        this.phone = phone;
        this.zipCode = zipCode;
        this.birthday = birthday;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format(
                "Fattura[id=%s, firstName='%s', lastName='%s', company='%s', vatCode='%s']",
                id, firstName, lastName, company, vatCode);
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    public String getVatCode() {
        return vatCode;
    }

    public void setVatCode(String vatCode) {
        this.vatCode = vatCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}