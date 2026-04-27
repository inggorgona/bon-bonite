package com.bonite.bon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionUI {

    public static final Target TXT_CEDULA_SESION =
            Target.the(("Campo cedula inicio de sesion"))
                    .located(By.id("username"));

    public static final Target TXT_CLAVE_SESION =
            Target.the(("Campo clave inicio de sesion"))
                    .located(By.id("password"));

    public static Target BTN_INICIAR_SESION =
            Target.the("Boton de inicio de sesion")
                    .locatedBy("//button[contains(text(),'Iniciar Sesión')]");
}
