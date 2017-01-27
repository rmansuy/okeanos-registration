/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.view.model;

import java.util.Date;
import sample.data.entity.MedicalCertificate;
import sample.data.entity.Registration;

/**
 *
 * @author Romain
 */
public class RegistrationViewModel {

    private Registration registration;

    public RegistrationViewModel() {
    }

    public RegistrationViewModel(Registration registration) {
        this.registration = registration;
    }

    public int getId() {
        return registration.getId();
    }

    public void setId(int id) {
        registration.setId(id);
    }

    public String getFirstName() {
        return registration.getFirstName();
    }

    public void setFirstName(String firstName) {
        registration.setFirstName(firstName);
    }

    public String getLastName() {
        return registration.getLastName();
    }

    public void setLastName(String lastName) {
        registration.setLastName(lastName);
    }

    public String getAddress() {
        return registration.getAddress();
    }

    public void setAddress(String address) {
        registration.setAddress(address);
    }

    public String getPostalCode() {
        return registration.getPostalCode();
    }

    public void setPostalCode(String postalCode) {
        registration.setPostalCode(postalCode);
    }

    public String getCity() {
        return registration.getCity();
    }

    public void setCity(String city) {
        registration.setCity(city);
    }

    public Date getBirthDate() {
        return registration.getBirthDate();
    }

    public void setBirthDate(Date birthDate) {
        registration.setBirthDate(birthDate);
    }

    public String getMail() {
        return registration.getMail();
    }

    public void setMail(String mail) {
        registration.setMail(mail);
    }

    public String getPhone() {
        return registration.getPhone();
    }

    public void setPhone(String phone) {
        registration.setPhone(phone);
    }

    public MedicalCertificate getMedicalCertificate() {
        return registration.getMedicalCertificate();
    }

    public void setMedicalCertificate(MedicalCertificate medicalCertificate) {
        registration.setMedicalCertificate(medicalCertificate);
    }

    public String getLicenseNumber() {
        return registration.getLicenseNumber();
    }

    public void setLicenseNumber(String licenseNumber) {
        registration.setLicenseNumber(licenseNumber);
    }

    public boolean isValid() {
        return registration.isValid();
    }

    public void setValid(boolean valid) {
        registration.setValid(valid);
    }

}
