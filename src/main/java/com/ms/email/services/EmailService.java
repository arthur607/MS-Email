package com.ms.email.services;

//camada intemerdiária entre o repository e o controller

import com.ms.email.models.EmailModel;
import com.ms.email.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    EmailRepository emailRepository;    //ponto de injeção do repository

    public void sendEmail(EmailModel emailModel) {
    }
}
