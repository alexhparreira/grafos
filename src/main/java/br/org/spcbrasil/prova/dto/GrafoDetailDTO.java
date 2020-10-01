package br.org.spcbrasil.prova.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GrafoDetailDTO {

    private String origem;
    private String destino;
    private Integer distancia;

}
