package com.revisitworks.newspringbootrevisitworks.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class SB003_OtherHTTPMethods {

    // Endpoint for handling GET requests to "/samples"
    @GetMapping("/get")
    public String get() {
        return "GET";
    }

    @PostMapping("/post")
    public String post() {
        return "POST";
    }

    @PutMapping("/put")
    public String put() {
        return "PUT";
    }

    @PatchMapping("/patch")
    public String patch() {
        return "PATCH";
    }

    @DeleteMapping("/delete")
    public String delete() {
        return "DELETE";
    }
/*
    @HeadMapping("/head")
    public String head() {
        return "HEAD";
    }

    @OptionsMapping("/options")
    public String options() {
        return "OPTIONS";
    }

    @TraceMapping("/trace")
    public String trace() {
        return "TRACE";
    }

    @ConnectMapping("/connect")
    public String connect() {
        return "CONNECT";
    }

    @TraceMapping("/trace")
    public String trace() {
        return "TRACE";
    }*/

}
