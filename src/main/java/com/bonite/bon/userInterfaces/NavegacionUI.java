package com.bonite.bon.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NavegacionUI {
    public static final Target BTN_ZAPATOS =
            Target.the("Categoria zapatos")
                    .located(By.id("menu-item-10"));

    public static final Target BTN_BOLSOS =
            Target.the("Categoria bolsos")
                    .located(By.id("menu-item-8"));

    public static final Target BTN_CINTURONES =
            Target.the("Categoria cinturones")
                    .located(By.id("menu-item-9"));

    public static final Target BTN_ACCESORIOS =
            Target.the("Categoria accesorios")
                    .located(By.id("menu-item-7"));

    public static final Target BTN_OUTLET =
            Target.the("Categoria outlet")
                    .located(By.id("menu-item-355651"));
}
