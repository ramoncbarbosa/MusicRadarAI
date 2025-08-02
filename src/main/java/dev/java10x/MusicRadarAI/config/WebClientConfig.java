package dev.java10x.MusicRadarAI.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Value("${gemini.api.url:https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent}")
    private String aiClientURL;

    @Bean
    public WebClient webClient(WebClient.Builder builder){
        return builder.baseUrl(this.aiClientURL).build();
    }

}
