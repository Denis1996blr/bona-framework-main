package bona.core.Target;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ITarget {

    WebElement ResolveFor(WebDriver webDriver);

    ITarget RelativeTo(ITarget targetSource);
}
