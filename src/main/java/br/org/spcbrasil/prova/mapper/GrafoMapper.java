package br.org.spcbrasil.prova.mapper;



import br.org.spcbrasil.prova.dto.GrafoDTO;
import br.org.spcbrasil.prova.persistence.db.entity.Grafo;
import br.org.spcbrasil.prova.persistence.db.entity.GrafoDetails;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * Mapper to Grafo.
 */
@Component("grafoMapper")
public class GrafoMapper {

    private ModelMapper modelMapper;

    final Converter<GrafoDTO, Grafo> userConverter = new Converter<GrafoDTO, Grafo>() {

        @Override
        public Grafo convert(MappingContext<GrafoDTO, Grafo> context) {

            GrafoDTO grafoDTO = context.getSource();
            // @formatter:off
            Grafo grafo = new Grafo();

            List<GrafoDetails> dados = new ArrayList<>();

            grafoDTO.getDados().forEach(d->{
                GrafoDetails detail = new GrafoDetails();
                detail.setDestino(d.getDestino());
                detail.setDistancia(d.getDistancia());
                detail.setOrigem(d.getOrigem());
                detail.setGrafo(grafo);
                dados.add(detail);

            });

            grafo.setDados(dados);

            grafo.setId(grafoDTO.getId());


            // @formatter:on
            return grafo;
        }
    };

    public GrafoMapper() {
        modelMapper = new ModelMapper();
        modelMapper.addConverter(userConverter);
    }

    public Grafo mapTo(GrafoDTO grafoDTO) {
        return this.modelMapper.map(grafoDTO, Grafo.class);
    }

}