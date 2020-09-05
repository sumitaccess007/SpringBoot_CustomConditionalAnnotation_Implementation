package com.sumitaccess007.config;

import com.sumitaccess007.custom.conditional.SMSProviderConditional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SMSConfig {

    @Bean
    @SMSProviderConditional(providerType = "airtel")
    public void activateAirtelProvider(){
        System.out.println("In activateAirtelProvider");
    }

    @Bean
    @SMSProviderConditional(providerType = "idea")
    public void activateIdeaProvider(){
        System.out.println("In activateIdeaProvider");
    }

    @Bean
    @SMSProviderConditional(providerType = "jio")
    public void activateJioProvider(){
        System.out.println("In activateJioProvider");
    }

}
