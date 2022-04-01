package bona.core.Target;

import org.openqa.selenium.By;

public class TargetBuilder {

    private String name;

    public TargetBuilder(String name){
        this.name = name;
    }

    public  ITarget locatedBy(By locator){
        return null;
    }
}
