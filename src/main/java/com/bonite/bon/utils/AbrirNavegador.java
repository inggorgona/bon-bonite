package com.bonite.bon.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirNavegador implements Interaction {
    private LeerDatosExcel excel;

    public AbrirNavegador() {
        try {
            excel = new LeerDatosExcel();
        } catch (Exception e) {
            throw new RuntimeException("No se pudo inicializar la lectura del Excel", e);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebDriverManager.chromedriver().setup();

        actor.attemptsTo(
                Open.url(excel.leerDatos("Dominio", 0, 0))
        );
    }

    public static AbrirNavegador cargarNavegador() {
        return Instrumented.instanceOf(AbrirNavegador.class).withProperties();
    }
}