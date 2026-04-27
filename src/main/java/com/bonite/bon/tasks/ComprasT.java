package com.bonite.bon.tasks;

import com.bonite.bon.utils.LeerDatosExcel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.io.IOException;

import static com.bonite.bon.userInterfaces.ComprasUI.*;

public class ComprasT implements Task {

    LeerDatosExcel excel;

    public ComprasT() throws IOException {
        excel = new LeerDatosExcel();
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        String categoria, productos, talla;
        categoria = excel.leerDatos("Compras", 1, 0);
        productos = excel.leerDatos("Compras", 1, 1);
        talla = excel.leerDatos("Compras", 1, 2);



        t.attemptsTo(
                Click.on(BTN_CATEGORIA.of(categoria)),
                Click.on(BTN_PRODUCTO.of(productos)),
                Click.on(BTN_TALLA_CALZADO.of(talla)),
                Click.on(BTN_CARRITO_COMPRA),
                //Wait
                Click.on(BTN_IR_CARRITO_COMPRA),
                Click.on(BTN_FINALIZAR_COMPRA),
                Click.on(BTN_CONTINUAR)


        );
    }

    public static ComprasT compras() {
        return Instrumented.instanceOf(ComprasT.class).withProperties();
    }
}
