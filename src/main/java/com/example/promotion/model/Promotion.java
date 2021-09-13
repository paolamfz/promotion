package com.example.promotion.model;


import com.example.promotion.dto.PromotionDto;

import javax.persistence.Entity;

@Entity
public class Promotion extends ModelBase<PromotionDto> {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
