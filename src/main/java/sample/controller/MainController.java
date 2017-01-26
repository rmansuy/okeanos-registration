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
import sample.view.model.RegistrationModel;

/**
 *
 * @author Romain
 */
@Controller
@RequestMapping("/main")
public class MainController {

    private static final String MODEL = "model";

    private static final String SUCCESS = "success";

    private static final String VIEW_MAIN = "main";
    
    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request, Model model) {
        model.addAttribute(MODEL, new RegistrationModel());
        return new ModelAndView(VIEW_MAIN);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView home(HttpServletRequest request,
            Model model,
            @ModelAttribute(value = "model") @Valid RegistrationModel registrationModel,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ModelAndView(VIEW_MAIN);
        } else {
            registrationService.save(registrationModel);
            model.addAttribute(MODEL, new RegistrationModel());
            model.addAttribute(SUCCESS, true);
        }

        return new ModelAndView(VIEW_MAIN);
    }

}
