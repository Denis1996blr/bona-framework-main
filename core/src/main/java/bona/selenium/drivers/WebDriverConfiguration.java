package bona.selenium.drivers;

import bona.selenium.config.properties.EnvProperty;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(EnvProperty.class)
public class WebDriverConfiguration {

    @Bean
    @ConditionalOnProperty(name = "env.browser", havingValue = "chrome")
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name = "env.browser", havingValue = "edge")
    public WebDriver microsoftEdgeDriver(){
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
