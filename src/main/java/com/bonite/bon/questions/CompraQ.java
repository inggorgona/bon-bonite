package com.bonite.bon.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.bonite.bon.userInterfaces.ComprasUI.LBL_FINALIZAR_COMPRA;

public class CompraQ implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LBL_FINALIZAR_COMPRA.resolveFor(actor).isVisible();
    }
    public static CompraQ validarCompra(){
        return Instrumented.instanceOf(CompraQ.class).withProperties();
    }
}
