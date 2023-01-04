package io.sabi.sampleapp;
import io.github.vandeli19.config.SabiConfig;
import io.github.vandeli19.config.SayConfig;
import io.github.vandeli19.service.SabiService;
import org.springframework.stereotype.Component;


@Component
public class SabiProcess {

    private final SabiConfig sabiConfig;
    private final SabiService sabiService;


    public SabiProcess(SabiConfig sabiConfig, SabiService sabiService) {
        this.sabiConfig = sabiConfig;
        this.sabiService = sabiService;
    }

    public String connectSabi() {
        return this.sabiService.connect(this.sabiConfig);
    }


}
