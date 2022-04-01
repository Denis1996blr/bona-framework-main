package bona.selenium.actions.chains;

import bona.core.Target.ITarget;
import bona.selenium.actions.ClickOnAction;

public class Click {

    public static ClickOnAction On(ITarget target){

        return new ClickOnAction(target);
    }
}
