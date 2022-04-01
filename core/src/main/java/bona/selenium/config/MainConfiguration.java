package bona.selenium.config;

import bona.selenium.config.properties.EnvProperty;
import bona.selenium.drivers.WebDriverConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableConfigurationProperties(EnvProperty.class)
@Import(WebDriverConfiguration.class)
public class MainConfiguration {
}
