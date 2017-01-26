/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.data.service;

import java.util.Set;
import java.util.stream.Collectors;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sample.data.entity.Registration;
import sample.data.repository.RegistrationRepository;
import sample.view.model.RegistrationModel;

/**
 *
 * @author Romain
 */
@Service
@Transactional
public class RegistrationService {
    
    @Autowired
    private RegistrationRepository registrationRepository;
    
    public Set<RegistrationModel> findAll() {
        return registrationRepository.findAll()
                .stream()
                .map(RegistrationModel::new)
                .collect(Collectors.toSet());
    }
    
    public RegistrationModel findByFirstNameAndLastName(String firstName, String lastName) {
        return new RegistrationModel(registrationRepository.findByFirstNameAndLastName(lastName, firstName));
    }
    
    public void save(RegistrationModel registrationModel) {
        
        // TODO check if registration not exist
        
        Registration registration = new Registration();
        registration.setAddress(registrationModel.getAddress());
        registration.setCity(registrationModel.getCity());
        registration.setFirstName(registrationModel.getFirstName());
        registration.setLastName(registrationModel.getLastName());
        registration.setMail(registrationModel.getMail());
        registration.setPhone(registrationModel.getPhone());
        registration.setPostalCode(registrationModel.getPostalCode());
        registration.setBirthDate(registrationModel.getBirthDateAsDate());
        registrationRepository.save(registration);
    }
}
