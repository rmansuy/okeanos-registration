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
import sample.data.service.exception.CannotFindElementException;
import sample.data.service.exception.ElementAlreadyExistException;
import sample.view.model.NewRegistrationModel;
import sample.view.model.RegistrationModel;
import sample.view.model.RegistrationViewModel;
import sample.view.model.RenewRegistrationModel;

/**
 *
 * @author Romain
 */
@Service
@Transactional
public class RegistrationService {

    private static int test4license = 0; // ONLY 4 TESTS

    @Autowired
    private RegistrationRepository registrationRepository;

    public Set<RegistrationViewModel> findAll() {
        return registrationRepository.findAll()
                .stream()
                .map(RegistrationViewModel::new)
                .collect(Collectors.toSet());
    }

    public RegistrationViewModel findByFirstNameAndLastName(String firstName, String lastName) {
        return new RegistrationViewModel(registrationRepository.findByFirstNameAndLastName(lastName, firstName));
    }

    public void newRegistration(NewRegistrationModel registrationModel) {
        if (registrationRepository.findByFirstNameAndLastName(registrationModel.getFirstName(), registrationModel.getLastName()) != null) {
            throw new ElementAlreadyExistException(String.format("Un membre %s %s existe déjà", registrationModel.getLastName(), registrationModel.getFirstName()));// TODO move text to ressource file
        }

        Registration registration = new Registration();
        registration.setLicenseNumber(String.format("A-07-0000%d", test4license++));
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

    public void renewRegistration(RenewRegistrationModel registrationModel) {
        Registration registration = registrationRepository.findByLicenseNumber(registrationModel.getLicenseNumber());
        if (registration == null) {
            throw new CannotFindElementException(String.format("La licence %s n'est pas enregistrée", registrationModel.getLicenseNumber()));
        } else {
            registration.setAddress(registrationModel.getAddress());
            registration.setCity(registrationModel.getCity());
            registration.setMail(registrationModel.getMail());
            registration.setPhone(registrationModel.getPhone());
            registration.setPostalCode(registrationModel.getPostalCode());
            registrationRepository.save(registration);
        }
    }
}
