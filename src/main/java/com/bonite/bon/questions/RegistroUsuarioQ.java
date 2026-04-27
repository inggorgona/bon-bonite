package com.bonite.bon.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.bonite.bon.userInterfaces.RegistroUsuarioUI.LBL_BIENVENIDA;

public class RegistroUsuarioQ implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LBL_BIENVENIDA.resolveFor(actor).isVisible();
    }
    public  static RegistroUsuarioQ validarMensaje(){
        return Instrumented.instanceOf(RegistroUsuarioQ.class).withProperties();
    }
}
