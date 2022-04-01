package bona.selenium.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("env")
public class EnvProperty {

    private String url;
    private String browser;

}
