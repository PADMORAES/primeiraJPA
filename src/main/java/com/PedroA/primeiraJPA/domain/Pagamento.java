package com.PedroA.primeiraJPA.domain;

import java.sql.Date;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cdPagamento;
    private Long cdServico;

    private boolean situacao;
    @Column(name = "tipo", length = 90)
    private String tipo;
    private double valor;
    private Date data;
    public static Pagamento parseNote(String line) {
        String[] text = line.split(",");
        Pagamento note = new Pagamento();
        note.setCdPagamento(Long.parseLong(text[0]));
        note.setCdServico(Long.parseLong(text[1]));
        return note;
    }
}
