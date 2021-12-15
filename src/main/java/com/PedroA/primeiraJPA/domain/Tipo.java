package com.PedroA.primeiraJPA.domain;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdTipo;

    private String nome;

    public static Tipo parseNote(String line) {
        String[] text = line.split(",");
        Tipo note = new Tipo();
        note.setCdTipo(Long.parseLong(text[0]));
        note.setNome(text[1]);
        return note;
    }
}
