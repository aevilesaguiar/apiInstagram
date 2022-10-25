package com.instagram.api.model.entities;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Postagem {

    @Id
    @GeneratedValue
    private Long id;
    private String emailUsuario;
    private String tipo;
    private String titulo;
    private String texto;
    private String urlFoto;
}
