/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.view.model;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Romain
 */
public class RenewRegistrationModel extends RegistrationModel {

    @NotNull
    @NotEmpty
    public String getLicenseNumber() {
        return registration.getLicenseNumber();
    }

    public void setLicenseNumber(String licenseNumber) {
        registration.setLicenseNumber(licenseNumber);
    }

}
