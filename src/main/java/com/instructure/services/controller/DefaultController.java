package com.instructure.services.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = DefaultController.REQUEST_ROOT, produces = MediaType.APPLICATION_JSON_VALUE)
public class DefaultController {
    static final String REQUEST_ROOT = "register";
    
    @SuppressWarnings("rawtypes")
    @RequestMapping(method = RequestMethod.GET, value = "/service/sample/{someValue}")
    @PreAuthorize("hasAnyRole('ROLE_API')")
    public ResponseEntity sampleSecureEndpoint(@PathVariable("someValue") String importantId) {
        return new ResponseEntity<>(System.getenv("HEALTHCHECK"), HttpStatus.OK);
    }    
}
