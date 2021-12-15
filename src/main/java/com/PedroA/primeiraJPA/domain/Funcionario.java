package com.PedroA.primeiraJPA.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdFuncionario;

    @Column(name = "nome", length = 90)
    private String nome;

    @Column(name = "cpf", length = 11)
    private String cpf;
    @Column(name = "telefone", length = 11)
    private String Telefone;
    private Boolean isActive;
    private String login;
    private String senha;

    public static Funcionario parseNote(String line) {
        String[] text = line.split(",");
        Funcionario note = new Funcionario();
        note.setCdFuncionario(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }
}
