/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.data.repository;

import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import sample.data.entity.Registration;

/**
 *
 * @author Romain
 */
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

    @Override
    Set<Registration> findAll();

    Registration findByFirstNameAndLastName(String lastName, String firstName);
    
    Registration findByLicenseNumber(String licenceNumber);
}
