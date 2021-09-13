package com.example.promotion.repository;


import com.example.promotion.model.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClienteRepository extends GenericRepository<Cliente> {
    List<Cliente> findByUsername(String username);

    @Query(value = "select c from Cliente c where c.birthdate like :date%")
    List<Cliente>  clientsWithBirthDay(@Param("date")String date);
}
