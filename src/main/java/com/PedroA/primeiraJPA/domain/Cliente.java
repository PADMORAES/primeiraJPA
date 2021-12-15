package com.PedroA.primeiraJPA.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdCliente;

    @Column(name = "nome", length = 90)
    private String nome;

    @Column(name = "telefone", length = 11)
    private String Telefone;
    private Boolean isActive;
    @Column(name = "cpf", length = 11)
    private String cpf;
    @Column(name = "nome", length = 90)
    private String endereco;
    
    public static Cliente parseNote(String line) {
        String[] text = line.split(",");
        Cliente note = new Cliente();
        note.setCdCliente(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }
}
