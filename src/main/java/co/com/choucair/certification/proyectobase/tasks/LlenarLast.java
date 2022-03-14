package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.LastPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LlenarLast implements Task {

    private List<UtestDatos> datos;

    public LlenarLast(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarLast thePage(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarLast.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datos.get(0).getStrPass()).into(LastPage.PASS),
    Enter.theValue(datos.get(0).getStrPass()).into(LastPage.PASS_CONFIRM),
        Click.on(LastPage.CHECK_1),
        Click.on(LastPage.CHECK_2),
        Click.on(LastPage.CHECK_3),
        Click.on(LastPage.BOTON_COMPLETAR)
    );


    }
}
