package bona.core.questions;

import bona.core.actors.IActor;

public interface IQuestion<TAnswer> {

    TAnswer answeredBy(IActor actor);
}
