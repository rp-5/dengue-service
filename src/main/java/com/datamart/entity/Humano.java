package com.datamart.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="humano")
@Entity(name="humano")

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Humano {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="nome")
    private String nome;

    @Column(name="idade")
    private int idade;

    @Column(name="endereco")
    private String endereco;

    @Column(name="complemento")
    private String complemento;

    @Column(name="possuiSintoma")
    private boolean possuiSintoma;

    @Column(name="sintoma")
    private ArrayList<String> sintoma;

    @Column(name="gravidade")
    private String gravidade;

    public Humano(String nome, int idade, String endereco, String complemento, boolean possuiSintoma, ArrayList<String> sintoma, String gravidade){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.complemento = complemento;
        this.possuiSintoma = possuiSintoma;
        this.sintoma = sintoma;
        this.gravidade = gravidade;
    }
}
