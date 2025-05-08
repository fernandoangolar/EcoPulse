package ao.com.angotech.application.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("EcoPulse: Plataforma Gamificada de Sustentabilidade com IA")
                        .version("v1")
                        .description("EcoPulse é um SaaS que promove ações sustentáveis gamificadas para combater a crise climática. " +
                                "Usuários participam de desafios ambientais, rastreiam seu impacto e ganham pontos, badges e posições em leaderboards. " +
                                "Um chatbot alimentado por IA sugere desafios e responde perguntas sobre sustentabilidade.")
                        .termsOfService("https://ao.com.angotech")
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://ao.com.angotech")
                        )
                );
    }

}
