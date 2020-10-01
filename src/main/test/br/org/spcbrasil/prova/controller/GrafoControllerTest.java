package br.org.spcbrasil.prova.controller;


import br.org.spcbrasil.prova.dto.GrafoDTO;
import br.org.spcbrasil.prova.dto.GrafoDetailDTO;
import br.org.spcbrasil.prova.persistence.db.repository.GrafoRepository;
import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc //need this in Spring Boot test
public class GrafoControllerTest {


    @MockBean
    private GrafoRepository grafoRepository;

    @Autowired
    private MockMvc mockMvc;

    protected void setUp() {

    }


    @Test
    public void testCreateMockMvc(){

        GrafoDTO grafoDTO = new GrafoDTO();

        List<GrafoDetailDTO> dados = new ArrayList<>();

        GrafoDetailDTO dto1 = new GrafoDetailDTO("A","B",100);
        GrafoDetailDTO dto2 = new GrafoDetailDTO("A","C",200);
        dados.add(dto1);
        dados.add(dto2);

        grafoDTO.setDados(dados);

        Gson gson = new Gson();
        String json = gson.toJson(grafoDTO);

        try {
            MvcResult result = this.mockMvc.perform(
                    post("/grafo")
                            .contentType(MediaType.APPLICATION_JSON)
                            .content(json))
                    .andExpect(status().is(HttpStatus.CREATED.value()))
                    .andReturn();



        }   catch (Exception e) {
            e.printStackTrace();
        }

    }


}

