package elements;

import bona.core.Target.ITarget;
import bona.core.Target.Target;
import org.openqa.selenium.By;

public class OnlinerElements {

    public static ITarget cart(){
        return Target.The("Cart element").
                locatedBy(By.id("cart-desktop")).
                RelativeTo(Target.The("Parent of Cart element").
                        locatedBy(By.id("userbar")));
    }
}
