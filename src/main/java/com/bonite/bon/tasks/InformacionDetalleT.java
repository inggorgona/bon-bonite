package com.bonite.bon.tasks;

import com.bonite.bon.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.bonite.bon.userInterfaces.ComprasUI.*;
import static com.bonite.bon.userInterfaces.ComprasUI.BTN_REALIZAR_PDIDO;
import static com.bonite.bon.userInterfaces.RegistroUsuarioUI.BTN_INICIO_SESION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InformacionDetalleT implements Task {
    LeerDatosExcel excel;

    public InformacionDetalleT() throws IOException {
        excel = new LeerDatosExcel();
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        String celular, ciudad, direccion;

        celular = excel.leerDatos("Compras", 1, 3);
        ciudad = excel.leerDatos("Compras", 1, 4);
        direccion = excel.leerDatos("Compras", 1, 5);
        t.attemptsTo(
                Enter.theValue(celular).into(TXT_CELULAR),
                Click.on(CHK_AUTORIZACION),
                Click.on(TXT_CIUDAD),
                WaitUntil.the(TXT_CIUDAD_SELECCIOADA, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(TXT_CIUDAD_SELECCIOADA),
                Enter.theValue(direccion).into(TXT_DIRECCION),
                WaitUntil.the(BTN_REALIZAR_PDIDO, isVisible()).forNoMoreThan(10).seconds(),
                JavaScriptClick.on(BTN_REALIZAR_PDIDO)
        );
    }

    public static InformacionDetalleT informacionDetalleCompra() {
        return Instrumented.instanceOf(InformacionDetalleT.class).withProperties();
    }
}
