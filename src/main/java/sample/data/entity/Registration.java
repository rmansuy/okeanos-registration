/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.data.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Romain
 */
@Entity
@Table(name = "Registration")
public class Registration {
    
    @Id
    @GeneratedValue
    private int id;
    
    @Column(nullable = false)
    private String firstName;
    
    @Column(nullable = false)
    private String lastName;
    
    @Column(nullable = false)
    private String address;
    
    @Column(nullable = false)
    private String postalCode;
    
    @Column(nullable = false)
    private String city;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    
    @Column(nullable = false)
    private String mail;
    
    @Column(nullable = false)
    private String phone;
    
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "registration")
    private MedicalCertificate medicalCertificate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public MedicalCertificate getMedicalCertificate() {
        return medicalCertificate;
    }

    public void setMedicalCertificate(MedicalCertificate medicalCertificate) {
        this.medicalCertificate = medicalCertificate;
    }    

    @Override
    public String toString() {
        return "Registration{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", postalCode=" + postalCode + ", city=" + city + ", birthDate=" + birthDate + ", mail=" + mail + ", phone=" + phone + ", medicalCertificate=" + medicalCertificate + '}';
    }
    
    
}
