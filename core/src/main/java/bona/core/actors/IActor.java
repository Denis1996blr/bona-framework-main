package bona.core.actors;

import bona.core.abilities.IAbility;
import bona.core.actions.ITask;
import bona.core.questions.IQuestion;

public interface IActor {

    void attemptsTo(ITask task);

    <TAnswer> TAnswer askFor(IQuestion<TAnswer> question);

    void can(IAbility ability);
}
