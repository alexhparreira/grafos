package br.org.spcbrasil.prova.dto;

import lombok.Data;

import java.util.List;

@Data
public class GrafoDTO {

    private Long id;

    private List<GrafoDetailDTO> dados;
}
