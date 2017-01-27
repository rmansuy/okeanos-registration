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
import sample.data.service.exception.CannotFindElementException;
import sample.view.model.RenewRegistrationModel;

/**
 *
 * @author Romain
 */
@Controller
@RequestMapping("/renew")
public class RenewController implements MyController {

    private static final String VIEW_RENEW = "renew";

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView main(HttpServletRequest request, Model model) {
        model.addAttribute(MODEL, new RenewRegistrationModel());
        return new ModelAndView(VIEW_RENEW);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView main(HttpServletRequest request,
            Model model,
            @ModelAttribute(value = "model") @Valid RenewRegistrationModel renewRegistrationModel,
            BindingResult bindingResult) {

        boolean success;

        if (bindingResult.hasErrors()) {
            // model n'est pas valide
            return new ModelAndView(VIEW_RENEW);
        } else {
            try {
                registrationService.renewRegistration(renewRegistrationModel);
                success = true;
            } catch (CannotFindElementException ex) {
                success = false;
                model.addAttribute(ERROR_MESSAGE, ex.getMessage());
            }
        }

        model.addAttribute(SUCCESS, success);
        if (success) {
            model.addAttribute(MODEL, new RenewRegistrationModel());// raz values
        }

        return new ModelAndView(VIEW_RENEW);
    }
}
