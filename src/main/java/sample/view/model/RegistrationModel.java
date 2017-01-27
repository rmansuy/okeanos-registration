/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.view.model;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import sample.data.entity.Registration;

/**
 *
 * @author Romain
 */
public abstract class RegistrationModel {

    protected Registration registration;

    public RegistrationModel() {
        this.registration = new Registration();
    }

    public RegistrationModel(Registration registration) {
        this.registration = registration;
    }

    @NotNull
    @NotEmpty
    public String getAddress() {
        return registration.getAddress();
    }

    public void setAddress(String address) {
        registration.setAddress(address);
    }

    @NotNull
    @NotEmpty
    public String getPostalCode() {
        return registration.getPostalCode();
    }

    public void setPostalCode(String postalCode) {
        registration.setPostalCode(postalCode);
    }

    @NotNull
    @NotEmpty
    public String getCity() {
        return registration.getCity();
    }

    public void setCity(String country) {
        registration.setCity(country);
    }

    @NotNull
    @NotEmpty
    @Email
    public String getMail() {
        return registration.getMail();
    }

    public void setMail(String mail) {
        registration.setMail(mail);
    }

    @NotNull
    @NotEmpty
    public String getPhone() {
        return registration.getPhone();
    }

    public void setPhone(String phone) {
        registration.setPhone(phone);
    }
}
