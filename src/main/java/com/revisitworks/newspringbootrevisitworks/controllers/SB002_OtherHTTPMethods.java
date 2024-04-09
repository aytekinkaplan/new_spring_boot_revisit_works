package com.revisitworks.newspringbootrevisitworks.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SB002_OtherHTTPMethods {

    // Endpoint for handling GET requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.GET)
    public String get() {
        return "GET";
    }

    // Endpoint for handling POST requests to "/updated"
    @PostMapping(path = "/updated")
    public String post() {
        return "POST";
    }

    // Endpoint for handling PUT requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.PUT)
    public String put() {
        return "PUT";
    }

    // Endpoint for handling DELETE requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.DELETE)
    public String delete() {
        return "DELETE";
    }

    // Endpoint for handling PATCH requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.PATCH)
    public String patch() {
        return "PATCH";
    }

    // Endpoint for handling HEAD requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.HEAD)
    public String head() {
        return "HEAD";
    }

    // Endpoint for handling OPTIONS requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.OPTIONS)
    public String options() {
        return "OPTIONS";
    }

    // Endpoint for handling TRACE requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.TRACE)
    public String trace() {
        return "TRACE";
    }
/*
    // Endpoint for handling CONNECT requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.CONNECT)
    public String connect() {
        return "CONNECT";
    }

    // Endpoint for handling LINK requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.LINK)
    public String link() {
        return "LINK";
    }

    // Endpoint for handling UNLINK requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.UNLINK)
    public String unlink() {
        return "UNLINK";
    }

    // Endpoint for handling PURGE requests to "/samples"
    @RequestMapping(path = "/samples", method= RequestMethod.PURGE)
    public String purge() {
        return "PURGE";
    }*/
}
