package br.org.spcbrasil.prova.persistence.db.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@Entity
@Table(name = "grafos")
public class Grafo implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(fetch=FetchType.LAZY,mappedBy = "grafo",cascade = CascadeType.ALL)
    private List<GrafoDetails> dados;


}
