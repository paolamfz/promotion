package com.example.promotion.repository;

import com.example.promotion.model.Promotion;

public interface PromotionRepository extends GenericRepository<Promotion> {
    default Promotion getByIdPromotion(Long id) {
        Promotion promotion = getByIdPromotion(id);
        return promotion;
    }
}
