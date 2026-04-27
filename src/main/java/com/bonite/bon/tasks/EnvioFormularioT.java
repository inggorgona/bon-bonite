package com.bonite.bon.tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.bonite.bon.userInterfaces.RegistroUsuarioUI.BTN_CREAR_USUARIO;

public class EnvioFormularioT implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(BTN_CREAR_USUARIO)
        );
    }
    public static EnvioFormularioT envioFormulario(){
        return Instrumented.instanceOf(EnvioFormularioT.class).withProperties();
    }
}
