package ao.com.angotech;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
public class TestControllerTest {

    @Autowired
    private MockMvc mockMvc; //objeto para simular chamadas HTTP

    @Test
    public void testHealthEndpoint() throws Exception {
        mockMvc.perform(get("/api/v1/health")) // faz um GET no endpoint
                .andExpect(status().isOk()) // espera status 200
                .andExpect(content().string("API is Running"));  // espera o conteúdo da resposta
    }
}
