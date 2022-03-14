package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DirectionPage {
    public static final Target CITY = Target.the("Ciudad").located(By.id("city"));
    public static final Target ZIP = Target.the("Codigo Postal").located(By.id("zip"));
    public static final Target COUNTRY_BOX = Target.the("Ciudad").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY = Target.the("Seleccionar Ciudad").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_DISPOSITIVOS = Target.the("Boton que pasa a siguiente parte").located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
