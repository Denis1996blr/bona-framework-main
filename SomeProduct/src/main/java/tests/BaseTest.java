package tests;

import bona.core.actors.Actor;
import bona.core.actors.IActor;
import bona.selenium.config.MainConfiguration;
import org.springframework.boot.SpringApplication;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest extends BaseEntity {

    protected IActor actor;

    @BeforeTest
    protected void init() {
        SpringApplication.run(MainConfiguration.class);
        actor = new Actor("Denis");
        //actor.can(WorkWith.Browser(new ChromeDriver()));
    }

}
