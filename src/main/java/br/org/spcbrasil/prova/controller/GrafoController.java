package br.org.spcbrasil.prova.controller;

import br.org.spcbrasil.prova.dto.GrafoDTO;
import br.org.spcbrasil.prova.mapper.GrafoDTOMapper;
import br.org.spcbrasil.prova.mapper.GrafoMapper;
import br.org.spcbrasil.prova.persistence.db.entity.Grafo;
import br.org.spcbrasil.prova.service.GrafoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("grafo")
public class GrafoController {

    @Autowired
    GrafoService grafoService;

    @Autowired
    GrafoMapper grafoMapper;

    @Autowired
    GrafoDTOMapper grafoDTOMapper;

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE}
    )
    public ResponseEntity<GrafoDTO> create(@Valid @RequestBody GrafoDTO grafoDTO) {

        Grafo grafo = grafoMapper.mapTo(grafoDTO);
        grafo = grafoService.create(grafo);
        grafoDTO.setId(grafo.getId());


        return ResponseEntity.status(HttpStatus.CREATED).body(grafoDTO);
    }


    @GetMapping(value = "/{id}",produces = {  MediaType.APPLICATION_JSON_VALUE  })
    public ResponseEntity<GrafoDTO> getById(@PathVariable Long id){

        Grafo grafo = grafoService.findById(id);

        GrafoDTO response = grafoDTOMapper.mapTo(grafo);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

}