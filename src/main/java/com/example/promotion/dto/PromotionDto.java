package com.example.promotion.dto;

import com.example.promotion.model.Promotion;

public class PromotionDto extends DtoBase<Promotion> {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
