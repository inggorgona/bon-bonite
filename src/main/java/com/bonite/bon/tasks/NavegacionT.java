package com.bonite.bon.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.bonite.bon.userInterfaces.NavegacionUI.*;

public class NavegacionT implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(BTN_ZAPATOS),
                Click.on(BTN_BOLSOS),
                Click.on(BTN_CINTURONES),
                Click.on(BTN_ACCESORIOS),
                Click.on(BTN_OUTLET)
        );
    }
    public static NavegacionT navegacionT(){
        return Instrumented.instanceOf(NavegacionT.class).withProperties();
    }
}
