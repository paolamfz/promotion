package com.example.promotion.repository;


import com.example.promotion.model.ModelBase;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("rawtypes")
public interface GenericRepository<T extends ModelBase> extends JpaRepository<T,Long> {

}
