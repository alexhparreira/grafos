package br.org.spcbrasil.prova.service;

import br.org.spcbrasil.prova.dto.GrafoDTO;
import br.org.spcbrasil.prova.exception.EntityNotFoundException;
import br.org.spcbrasil.prova.exception.GrafoNotFoundException;
import br.org.spcbrasil.prova.persistence.db.entity.Grafo;
import br.org.spcbrasil.prova.persistence.db.repository.GrafoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Data
public class GrafoService {


    GrafoRepository grafoRepository;

    @Transactional
    public Grafo create(Grafo grafo) {

         grafoRepository.save(grafo);

         return grafo;

    }

    public GrafoService(GrafoRepository grafoRepository) {
        this.grafoRepository = grafoRepository;
    }



    public Grafo findById(Long id) {

        Grafo grafo2 = grafoRepository.getOne(id);

        Grafo grafo = grafoRepository.findById(id).orElseThrow(() -> new GrafoNotFoundException("NÃO ENCONTRADA"));

        return grafo;
    }
}
