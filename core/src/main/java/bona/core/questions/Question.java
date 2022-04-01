package bona.core.questions;

import bona.core.actors.IActor;

public abstract class Question<TAnswer> implements IQuestion<TAnswer>{

    @Override
    public TAnswer answeredBy(IActor actor) {
       return answer(actor);
    }

    protected  abstract TAnswer answer(IActor actor);

}
