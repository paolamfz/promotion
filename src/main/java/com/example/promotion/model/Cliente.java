package com.example.promotion.model;

import com.example.promotion.dto.ClienteDto;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Cliente extends ModelBase<ClienteDto> {
    private String email;
    private String username;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd")

    @Column(nullable = false)
    private String birthdate;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
