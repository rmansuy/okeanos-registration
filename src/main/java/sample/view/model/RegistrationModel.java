/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.view.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import sample.data.entity.Registration;

/**
 *
 * @author Romain
 */
public class RegistrationModel {

    private static final String DD_MM_YYYY = "yyyy-MM-dd"; // TODO default format, we must normalize

    private Registration registration;

    private String birthDate;

    public RegistrationModel() {
        this.registration = new Registration();
    }

    public RegistrationModel(Registration registration) {
        this.registration = registration;
    }

    @NotNull
    @NotEmpty
    public String getFirstName() {
        return registration.getFirstName();
    }

    public void setFirstName(String firstName) {
        registration.setFirstName(firstName);
    }

    @NotNull
    @NotEmpty
    public String getLastName() {
        return registration.getLastName();
    }

    public void setLastName(String lastName) {
        registration.setLastName(lastName);
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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    public String getBirthDate() {
        if(birthDate == null) {
            return registration.getBirthDate() == null ? null : registration.getBirthDate().toString(); // TODO burkkk enabled
        }
        return birthDate;
    }

    public Date getBirthDateAsDate() {
        if (birthDate != null) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat(DD_MM_YYYY);
                return dateFormat.parse(birthDate);
            } catch (ParseException ex) {
                // TODO Log 
                ex.printStackTrace();
            }
        }
        return null;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
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

    @Override
    public String toString() {
        return "RegistrationModel{" + "registration=" + registration + '}';
    }
}
