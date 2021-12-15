package com.PedroA.primeiraJPA.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trabalhador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdTrabalhador;

    private Long cdTipo;
    private Long cdFuncionario;
}
