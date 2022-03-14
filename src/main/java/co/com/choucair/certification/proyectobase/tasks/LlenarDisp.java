package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.DevicePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class LlenarDisp implements Task {
    private List<UtestDatos> datos;

    public LlenarDisp(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDisp thePage(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarDisp.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicePage.CONTENEDOR_DISP_MOV), Enter.theValue(datos.get(0).getStrDispositivo()).into(DevicePage.DISP_MOVIL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                         Click.on(DevicePage.CONTENEDOR_MODEL), Enter.theValue(datos.get(0).getStrModelo()).into(DevicePage.MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                         Click.on(DevicePage.CONTENEDOR_OS), Enter.theValue(datos.get(0).getStrSo()).into(DevicePage.OS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                         Click.on(DevicePage.BUTTON_FINAL)
        );

    }
}
