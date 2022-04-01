package bona.core.actors;

import bona.core.abilities.IAbility;
import bona.core.actions.ITask;
import bona.core.questions.IQuestion;

import java.lang.reflect.Type;
import java.util.Map;

public class Actor implements IActor {

    private String name;
    private Map<Type, IAbility> Abilities;

    public Map<Type, IAbility> getAbilities() {
        return Abilities;
    }

    public String getName() {
        if (name != null) {
            return name;
        } else return "ScreenPlayer";
    }

    public Actor() {
    }

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void attemptsTo(ITask task) {
        task.performAs(this);
    }

    @Override
    public <TAnswer> TAnswer askFor(IQuestion<TAnswer> question) {
        return question.answeredBy(this);
    }

    @Override
    public void can(IAbility ability) {

    }
}
