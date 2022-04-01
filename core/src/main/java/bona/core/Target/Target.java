package bona.core.Target;

public class Target {


    public static TargetBuilder The(String name) {
        return new TargetBuilder(name);
    }

}
