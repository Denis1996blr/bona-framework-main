package bona.selenium.questions.chains.htmlAttribute;

import bona.core.Target.ITarget;
import bona.selenium.questions.HtmlAttributeQuestion;

public class HtmlAttribute {

    public static HtmlAttributeQuestion Of(ITarget target) {
        return new HtmlAttributeQuestion(target);
    }
}
