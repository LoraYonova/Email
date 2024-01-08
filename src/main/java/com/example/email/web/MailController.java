package com.example.email.web;

import com.example.email.model.Mail;
import com.example.email.service.MailService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    private final MailService mailService;

    public MailController(MailService mailService) {
        this.mailService = mailService;
    }


    @PostMapping("/send-email")
    public String sendEmail(@RequestBody Mail mail) {

        mailService.sendEmail(mail.getSentTo(), mail.getSubject(),mail.getText());
        return "Email sent successfully!";
    }
}
