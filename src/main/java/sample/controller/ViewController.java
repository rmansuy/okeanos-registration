/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/view")
public class ViewController {

    private static final String MODEL = "model";

    private static final String VIEW_VIEW = "view";

    @Autowired
    private RegistrationService registrationService;

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView home(HttpServletRequest request, Model model) {
        model.addAttribute(MODEL, registrationService.findAll());
        return new ModelAndView(VIEW_VIEW);
    }

}
