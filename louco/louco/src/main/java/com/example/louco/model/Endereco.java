package com.example.louco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String logradouro;
    private String nuemero;
    private String cidade;

    public Endereco() {
    }

    public Endereco(Long id, String logradouro, String nuemero, String cidade) {
        this.id = id;
        this.logradouro = logradouro;
        this.nuemero = nuemero;
        this.cidade = cidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNuemero() {
        return nuemero;
    }

    public void setNuemero(String nuemero) {
        this.nuemero = nuemero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logradouro='" + logradouro + '\'' +
                ", nuemero='" + nuemero + '\'' +
                ", cidade='" + cidade + '\'' +
                '}';
    }
}
