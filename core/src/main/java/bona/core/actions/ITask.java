package bona.core.actions;

import bona.core.actors.IActor;

public interface ITask {
    void performAs(IActor actor);
}
