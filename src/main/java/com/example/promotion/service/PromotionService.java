package com.example.promotion.service;


import com.example.promotion.model.Cliente;
import com.example.promotion.model.Promotion;
import com.example.promotion.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PromotionService {
    private JavaMailSender javaMailSender;
    private final PromotionRepository promotionRepository;
    @Value("${Promotion.message.discountValue}")
    private String discountValue;

    private final ClienteService clienteService;

    public PromotionService(PromotionRepository promotionRepository, ClienteService clienteService, JavaMailSender javaMailSender){
        this.promotionRepository = promotionRepository;
        this.clienteService = clienteService;
        this.javaMailSender = javaMailSender;
    }

    public Promotion save(Promotion promotion){
        return promotionRepository.save(promotion);
    }
   public List<Cliente> sendEmailPromoted(String date) {
        List<Cliente> clientsBirthday = clienteService.clientsBirthdate(date);
        for(Cliente cliente :clientsBirthday){
            SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
            simpleMailMessage.setFrom("montanofernandezpaola@gmail.com");
            simpleMailMessage.setTo(cliente.getEmail());
            simpleMailMessage.setSubject("Pueba");
            Promotion p = promotionRepository.getByIdPromotion(1L);
            String contentText = p.getDescription();
            contentText = contentText.replace("<name>",cliente.getUsername());
            contentText = contentText.replace("<discountValue>",discountValue);
            simpleMailMessage.setText(contentText);
            javaMailSender.send(simpleMailMessage);
        }

        return clientsBirthday;
    }
}

