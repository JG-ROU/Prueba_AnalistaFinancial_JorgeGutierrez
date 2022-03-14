package co.com.choucair.certification.proyectobase.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import co.com.choucair.certification.proyectobase.userinterface.MainuTestPage;

import java.util.PrimitiveIterator;

public class AbrirPagina implements Task {

    private  MainuTestPage page;

    public static AbrirPagina thePage(){
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page),
                Click.on(MainuTestPage.JOIN));

    }
}
