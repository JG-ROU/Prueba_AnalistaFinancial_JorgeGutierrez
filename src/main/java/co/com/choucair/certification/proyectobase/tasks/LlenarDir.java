package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.DirectionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;



public class LlenarDir implements Task {
    public LlenarDir(List<UtestDatos> datos) {
        this.datos = datos;
    }

    private List<UtestDatos> datos;

    public static LlenarDir thePage(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarDir.class, datos);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue(datos.get(0).getStrCity()).into(DirectionPage.CITY), Hit.the(Keys.ARROW_DOWN).into(DirectionPage.CITY), Hit.the(Keys.ENTER).into(DirectionPage.CITY),
                Enter.theValue(datos.get(0).getStrZip()).into(DirectionPage.ZIP),
                Click.on(DirectionPage.COUNTRY_BOX),Enter.theValue(datos.get(0).getStrPais()).into(DirectionPage.COUNTRY),  Hit.the(Keys.ARROW_DOWN).into(DirectionPage.COUNTRY),Hit.the(Keys.ENTER).into(DirectionPage.COUNTRY),
                Click.on(DirectionPage.BOTON_DISPOSITIVOS));

    }
}
