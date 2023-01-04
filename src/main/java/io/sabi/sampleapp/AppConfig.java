package io.sabi.sampleapp;

import io.github.vandeli19.config.SabiConfig;
import io.github.vandeli19.config.SayConfig;
import io.github.vandeli19.config.SayParam;
import io.github.vandeli19.config.SayProperties;
import io.github.vandeli19.service.SabiService;
import io.github.vandeli19.service.Saying;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${say.userName}")
    private String name;

    @Value("${say.message}")
    private String mess;

    @Bean
    public SabiConfig sabiConfig() {

        String partnerId= "KAYA.ID";
        String partnerKey= "12345";
        String version = "2";
        return new SabiConfig(partnerId,partnerKey,version);
    }
    @Bean
    public SabiService sabiService() {
        return new SabiService();
    }

    @Bean
    public Saying saying(){
        SayConfig sayConfig = new SayConfig();

        sayConfig.put(SayParam.USERNAME,name);
        sayConfig.put(SayParam.MESSAGE,mess);
        return new Saying(sayConfig);
    }
}
