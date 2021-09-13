package com.example.promotion.controller;

import com.example.promotion.model.Cliente;
import com.example.promotion.model.Promotion;
import com.example.promotion.service.PromotionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService){
        this.promotionService = promotionService;
    }

   @GetMapping("/{birthdate}")
    public List<Cliente> promoted(@PathVariable String birthdate){
        return promotionService.sendEmailPromoted(birthdate);
    }
    @PostMapping
    public Promotion newPromotion(@RequestBody Promotion promotion){
        return promotionService.save(promotion);
    }
}


