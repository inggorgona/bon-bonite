package com.bonite.bon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ComprasUI {

    public static final Target BTN_CATEGORIA =
            Target.the(("Seleccionar la categoria"))
                    .locatedBy("(//a[contains(text(),'{0}')])[1]");

    public static final Target BTN_PRODUCTO =
            Target.the("Seleccionar producto {0}")
                    .locatedBy("//div[contains(@class,'group')][.//h4[normalize-space()='{0}']]//a[contains(@href,'/producto/')]");


    public static final Target BTN_TALLA_CALZADO =
            Target.the(("Seleccionar la talla del calzado"))
                    .locatedBy("//button[contains(text(),'{0}')]");

    public static final Target BTN_CARRITO_COMPRA =
            Target.the(("Seleccionar la carrito de compra"))
                    .locatedBy("//button[contains(text(),'carrito')]");

    public static final Target BTN_IR_CARRITO_COMPRA =
            Target.the(("Dirigir al carrito de compra"))
                    .locatedBy("//*[@id=\"header\"]/div/div[3]/div[3]/a");

    public static final Target BTN_FINALIZAR_COMPRA =
            Target.the(("Boton de finlizar compra "))
                    .locatedBy("//a[contains(text(),'Finalizar compra')]");

    public static final Target BTN_CONTINUAR =
            Target.the(("Continuar con la compra"))
                    .locatedBy("//button[contains(text(),'Continuar')]");

    public static final Target TXT_CELULAR =
            Target.the(("Numero de celular"))
                    .located(By.id("billing_phone"));

    public static final Target TXT_CIUDAD =
            Target.the(("Campo ciudad"))
                    .located(By.id("select2-billing_city-container"));

    public static final Target TXT_CIUDAD_SELECCIOADA =
            Target.the(("Ciudad seleccionada"))
                    .locatedBy("//li[contains(text(),'Abejorral')]");

    public static final Target TXT_DIRECCION =
            Target.the(("Direccion"))
                    .locatedBy("//input[@name='billing_address_1']");

    public static final Target CHK_AUTORIZACION =
            Target.the(("Check de autorizacion"))
                    .locatedBy("//input[@id='terms']");

    public static final Target BTN_REALIZAR_PDIDO =
            Target.the(("Boton de realizar pedido"))
                    .locatedBy("//button[contains(text(),'Realizar el pedido')]");

    public static final Target LBL_TELEFONO =
            Target.the(("Para hacer scroll con el Texto de telefeno o celular"))
                    .locatedBy("//label[@for='billing_phone']");

    public static final Target LBL_FINALIZAR_COMPRA =
            Target.the(("Mensaje de finalizacion de compra"))
                    .locatedBy("//h1[contains(text(),'Finalizar compra')]");


}
