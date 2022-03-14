package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {

    public static final Target FIRST_NAME = Target.the("Ingrese Nombre").located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Ingrese Apellido").located(By.id("lastName"));
    public static final Target EMAIL = Target.the("Ingrese Correo").located(By.id("email"));
    public static final Target MONTH = Target.the("Ingrese Mes de Nacimiento").located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target DAY = Target.the("Ingrese Dia de Nacimiento").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));
    public static final Target YEAR = Target.the("Ingrese Año de Nacimiento").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));
    public static final Target BUTTON = Target.the("Boton que lleva a la siguiente zona").located(By.xpath("//a[@class='btn btn-blue']"));

}
