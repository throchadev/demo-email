package br.com.throchadev.demoemail.controller;

import br.com.throchadev.demoemail.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping(value = "/send")
    public String sendemail() {

        emailService.sendMail("**@gmail.com", "Test Subject", "Test email");

        return "email-sent";
    }
}
