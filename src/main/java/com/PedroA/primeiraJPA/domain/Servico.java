package com.PedroA.primeiraJPA.domain;

import java.sql.Date;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdServico;

    @Column(name = "nome", length = 90)
    private String nome;

    private double valor;
    private Date data;
    private Boolean isActive;
    private String cdTrabalhador;
    private String cdCliente;
    
    public static Servico parseNote(String line) {
        String[] text = line.split(",");
        Servico note = new Servico();
        note.setCdServico(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }
}
