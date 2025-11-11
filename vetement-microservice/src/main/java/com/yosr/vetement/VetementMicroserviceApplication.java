package com.yosr.vetement;

import com.yosr.vetement.entities.Vetement;
import com.yosr.vetement.repos.VetementRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@EnableFeignClients
@SpringBootApplication
public class VetementMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VetementMicroserviceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(VetementRepository vetementRepository) {
        return args -> {
            vetementRepository.save(Vetement.builder()
                    .vetName("veste")
                    .vetSize("M")
                            .genCode("H")
                    .build());
        };

        }
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
}
