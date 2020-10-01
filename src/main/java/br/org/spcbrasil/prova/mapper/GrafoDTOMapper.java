package br.org.spcbrasil.prova.mapper;



import br.org.spcbrasil.prova.dto.GrafoDTO;
import br.org.spcbrasil.prova.dto.GrafoDetailDTO;
import br.org.spcbrasil.prova.persistence.db.entity.Grafo;
import br.org.spcbrasil.prova.persistence.db.entity.GrafoDetails;
import org.modelmapper.Converter;
import org.modelmapper.ModelMapper;
import org.modelmapper.spi.MappingContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * Mapper to GrafoDTO.
 */
@Component("grafoDTOMapper")
public class GrafoDTOMapper {

    private ModelMapper modelMapper;

    final Converter<Grafo, GrafoDTO> userConverter = new Converter<Grafo, GrafoDTO>() {

        @Override
        public GrafoDTO convert(MappingContext<Grafo, GrafoDTO> context) {

            Grafo grafo = context.getSource();
            // @formatter:off
            GrafoDTO grafoDTO = new GrafoDTO();

            List<GrafoDetailDTO> dados = new ArrayList<>();

            grafo.getDados().forEach(d->{

                GrafoDetailDTO detail = new GrafoDetailDTO();
                detail.setDestino(d.getDestino());
                detail.setDistancia(d.getDistancia());
                detail.setOrigem(d.getOrigem());

                dados.add(detail);

            });

            grafoDTO.setDados(dados);

            grafoDTO.setId(grafo.getId());


            // @formatter:on
            return grafoDTO;
        }
    };

    public GrafoDTOMapper() {
        modelMapper = new ModelMapper();
        modelMapper.addConverter(userConverter);
    }

    public GrafoDTO mapTo(Grafo grafo) {
        return this.modelMapper.map(grafo, GrafoDTO.class);
    }

}