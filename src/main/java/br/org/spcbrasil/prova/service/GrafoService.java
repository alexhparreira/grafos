package br.org.spcbrasil.prova.service;

import br.org.spcbrasil.prova.dto.GrafoDTO;
import br.org.spcbrasil.prova.persistence.db.entity.Grafo;
import br.org.spcbrasil.prova.persistence.db.repository.GrafoRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
