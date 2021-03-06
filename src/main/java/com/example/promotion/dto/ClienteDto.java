package com.example.promotion.dto;

import com.example.promotion.model.Cliente;

import java.util.Date;

public class ClienteDto extends DtoBase<Cliente> {
    private String email;
    private String username;
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
