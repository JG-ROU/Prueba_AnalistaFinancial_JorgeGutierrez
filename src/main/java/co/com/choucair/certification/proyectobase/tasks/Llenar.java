package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.FormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.awt.*;
import java.util.List;


public class Llenar implements Task {


    public Llenar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    private List<UtestDatos> datos;

    public static Llenar thePage(List<UtestDatos> datos) {
        return Tasks.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(FormPage.FIRST_NAME),
                Enter.theValue(datos.get(0).getStrApellido()).into(FormPage.LAST_NAME),
                Enter.theValue(datos.get(0).getStrEmail()).into(FormPage.EMAIL),
                Enter.theValue(datos.get(0).getStrMesNacimiento()).into(FormPage.MONTH),
                Enter.theValue(datos.get(0).getStrDiaNacimiento()).into(FormPage.DAY),
                Enter.theValue(datos.get(0).getStrAnoNacimiento()).into(FormPage.YEAR),
                Click.on(FormPage.BUTTON));
        
    }
}
