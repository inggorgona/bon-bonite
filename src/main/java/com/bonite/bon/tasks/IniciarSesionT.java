package com.bonite.bon.tasks;

import com.bonite.bon.models.IniciarSesionM;
import com.bonite.bon.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.bonite.bon.userInterfaces.IniciarSesionUI.*;
import static com.bonite.bon.userInterfaces.RegistroUsuarioUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class IniciarSesionT implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {
        IniciarSesionM datos;

        try {
            LeerDatosExcel excel = new LeerDatosExcel();

            datos = new IniciarSesionM(
                    excel.leerDatos("Registro_Empleado", 1, 0),
                    excel.leerDatos("Registro_Empleado", 1, 4)
            );

        } catch (IOException e) {
            throw new RuntimeException("Error leyendo Excel", e);
        }

        t.attemptsTo(
                Click.on(BTN_COOKIES),
                WaitUntil.the(BTN_INICIO_SESION, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_INICIO_SESION),
                Enter.theValue(datos.getCedula()).into(TXT_CEDULA_SESION),
                Enter.theValue(datos.getClave()).into(TXT_CLAVE_SESION),
                Click.on(BTN_INICIAR_SESION)
        );
    }

    public static IniciarSesionT iniciarSesion() {
        return Instrumented.instanceOf(IniciarSesionT.class).withProperties();
    }
}
