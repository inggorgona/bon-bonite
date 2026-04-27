package com.bonite.bon.tasks;

import com.bonite.bon.models.RegistroUsuarioM;
import com.bonite.bon.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.io.IOException;

import static com.bonite.bon.userInterfaces.RegistroUsuarioUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class RegistrarUsuarioT implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        RegistroUsuarioM datos;

        try {
            LeerDatosExcel excel = new LeerDatosExcel();

            datos = new RegistroUsuarioM(
                    excel.leerDatos("Registro_Empleado", 1, 0),
                    excel.leerDatos("Registro_Empleado", 1, 1),
                    excel.leerDatos("Registro_Empleado", 1, 2),
                    excel.leerDatos("Registro_Empleado", 1, 3),
                    excel.leerDatos("Registro_Empleado", 1, 4),
                    excel.leerDatos("Registro_Empleado", 1, 5)
            );

        } catch (IOException e) {
            throw new RuntimeException("Error leyendo Excel", e);
        }

        actor.attemptsTo(
                Click.on(BTN_COOKIES),

                WaitUntil.the(BTN_INICIO_SESION, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_INICIO_SESION),

                WaitUntil.the(BTN_REGISTRAR, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(BTN_REGISTRAR),

                WaitUntil.the(TXT_CEDULA, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(datos.getCedula()).into(TXT_CEDULA),
                Enter.theValue(datos.getNombres()).into(TXT_NOMBRES),
                Enter.theValue(datos.getApellidos()).into(TXT_APELLIDOS),
                Enter.theValue(datos.getCorreo()).into(TXT_CORREO),
                Enter.theValue(datos.getClave()).into(TXT_CLAVE),
                Enter.theValue(datos.getConfirmarClave()).into(TXT_CONFIRMAR_CLAVE),
                Click.on(CHK_RECIBIR_INFORMACION),
                Click.on(CHK_AUTORIZACION)
        );
    }

    public static RegistrarUsuarioT registrar() {
        return Instrumented.instanceOf(RegistrarUsuarioT.class).withProperties();
    }
}