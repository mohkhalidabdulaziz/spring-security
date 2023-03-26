package com.khalid.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @GetMapping("/message")
    public String getMessage() {
        return "message";
    }

    @GetMapping("/msg")
    public String getShortMessage() {
        return "msg";
    }

}
