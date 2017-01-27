/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import sample.data.service.RegistrationService;
import sample.data.service.exception.ElementAlreadyExistException;
import sample.view.model.NewRegistrationModel;

/**
 *
 * @author Romain
 */
@Controller
@RequestMapping("/new")
public class NewController implements MyController {

    private static final String VIEW_NEW = "new";

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView main(HttpServletRequest request, Model model) {
        model.addAttribute(MODEL, new NewRegistrationModel());
        return new ModelAndView(VIEW_NEW);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView main(HttpServletRequest request,
            Model model,
            @ModelAttribute(value = "model") @Valid NewRegistrationModel newRegistrationModel,
            BindingResult bindingResult) {

        boolean success;

        if (bindingResult.hasErrors()) {
            // model n'est pas valide
            return new ModelAndView(VIEW_NEW);
        } else {
            try {
                registrationService.newRegistration(newRegistrationModel);
                success = true;
            } catch (ElementAlreadyExistException ex) {
                success = false;
                model.addAttribute(ERROR_MESSAGE, ex.getMessage());
            }
        }

        model.addAttribute(SUCCESS, success);
        if (success) {
            model.addAttribute(MODEL, new NewRegistrationModel());// raz values
        }

        return new ModelAndView(VIEW_NEW);
    }

}
