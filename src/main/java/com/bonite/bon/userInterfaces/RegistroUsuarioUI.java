package com.bonite.bon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroUsuarioUI {

    public static final Target BTN_COOKIES =
            Target.the(("Boton Cookies"))
                    .located(By.id("cookiescript_accept"));

    public static final Target BTN_INICIO_SESION =
            Target.the("Boton inicio de sesion")
                    .located(By.id("toggle-account-menu"));

    public static final Target BTN_REGISTRAR =
            Target.the(("Boton registrar"))
                    .locatedBy("//span[contains(text(),'Regístrate')]");

    public static final Target TXT_CEDULA =
            Target.the(("Campo cedula"))
                    .located(By.id("reg_username"));

    public static final Target TXT_NOMBRES =
            Target.the(("Campo nombres"))
                    .located(By.id("first_name"));

    public static final Target TXT_APELLIDOS =
            Target.the(("Campo apellidos"))
                    .located(By.id("last_name"));

    public static final Target TXT_CORREO =
            Target.the(("Campo correo"))
                    .located(By.id("reg_email"));

    public static final Target TXT_CLAVE =
            Target.the(("Campo clave"))
                    .located(By.id("reg_password"));

    public static final Target TXT_CONFIRMAR_CLAVE =
            Target.the(("Campo confirmar clave"))
                    .located(By.id("reg_password2"));

    public static final Target CHK_RECIBIR_INFORMACION =
            Target.the(("Check de recibir informacion"))
                    .located(By.id("newsletter_authorization"));

    public static final Target CHK_AUTORIZACION =
            Target.the(("Check de autorizacion de datos"))
                    .located(By.id("privacy_policy_reg"));

    public static final Target BTN_CREAR_USUARIO =
            Target.the(("Boton de crear usuario"))
                    .locatedBy("//button[contains(text(),'Registrarme')]");

    public static final Target LBL_BIENVENIDA =
            Target.the(("Mensaje de bienvenida"))
                    .locatedBy("//h3[contains(text(),'Hola,')]");

}