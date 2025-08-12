package dev.java10x.MusicRadarAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MusicRadarAiApplication {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "embedded"); // prod or embedded profile
		SpringApplication.run(MusicRadarAiApplication.class, args);
	}

}
