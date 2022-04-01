package bona.core.abilities;

import org.openqa.selenium.WebDriver;

public class WorkWith {

    public static WorkWithBrowser Browser(WebDriver webDriver){
        return new WorkWithBrowser();
    }
}
