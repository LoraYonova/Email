package com.example.email.service;

public interface MailService {
    void sendEmail(String sentTo, String subject, String text);

}
