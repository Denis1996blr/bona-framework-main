package tests.smoke;

import bona.core.Target.Target;
import bona.selenium.actions.chains.Click;
import bona.selenium.questions.chains.htmlAttribute.HtmlAttribute;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import elements.OnlinerElements;
import org.testng.annotations.Test;
import tests.BaseTest;

public class Test1 extends BaseTest {

    @Test
    public void myFirstTest() {
        actor.attemptsTo(Click.On(OnlinerElements.cart()));
        var attribute = actor.askFor(HtmlAttribute.Of(OnlinerElements.cart()));
    }

    @Test
    public void mySecondTest() {
        actor.attemptsTo(Click.On(OnlinerElements.cart()));
        var attribute = actor.askFor(HtmlAttribute.Of(OnlinerElements.cart()));
    }
}
