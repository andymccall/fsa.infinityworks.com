package com.infinityworks.fsa.controller;

import com.infinityworks.fsa.model.AuthorityStats;
import com.infinityworks.fsa.service.AuthoritiesService;
import com.infinityworks.fsa.service.EstablishmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The FsaController class is the controller for
 * the application.  All web requests are routed
 * through this controller.
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-08
 */
@Controller
public class FsaController {

    private static final Logger logger =
            LoggerFactory.getLogger(FsaController.class);

    AuthoritiesService authoritiesService;
    EstablishmentService establishmentService;

    @Autowired
    public void setAuthoritiesService(AuthoritiesService authoritiesService) {
        this.authoritiesService = authoritiesService;
    }

    @Autowired
    public void setEstablishmentService(EstablishmentService establishmentService) {
        this.establishmentService = establishmentService;
    }

    @RequestMapping(value = {"/", "index"}, method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("authoritiesList", authoritiesService.getAuthorities());

        return "index";
    }

    @RequestMapping(value = {"/{localAuthorityId}"}, method = RequestMethod.GET)
    public String authorityId(@PathVariable Integer localAuthorityId,
                              Model model) {

        AuthorityStats authorityStats =
                new AuthorityStats(establishmentService.getEstablishmentsByLocalAuthorityId(localAuthorityId));

        model.addAttribute("localAuthorityId", localAuthorityId);
        model.addAttribute("authoritiesList", authoritiesService.getAuthorities());
        model.addAttribute("authorityStats", authorityStats);

        return "index";
    }

}
