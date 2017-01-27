/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.view.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Romain
 */
public class NewRegistrationModel extends RegistrationModel {

    private static final String DD_MM_YYYY = "yyyy-MM-dd"; // TODO default format, we must normalize

    private String birthDate;

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
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    public String getBirthDate() {
        if (birthDate == null) {
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

}
