package br.org.spcbrasil.prova.persistence.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "grafos_details")
public class GrafoDetails implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origem;

    private String destino;

    private Integer distancia;

    @ManyToOne
    @JoinColumn(name="grafo_id", nullable=false)
    private Grafo grafo;


}
