package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LastPage {

    public static final Target PASS = Target.the("Digite una clave").located(By.id("password"));
    public static final Target PASS_CONFIRM = Target.the("Digite una clave nuevamente").located(By.id("confirmPassword"));
    public static final Target CHECK_1 = Target.the("Recibir info").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_2 = Target.the("Aceptar terminos").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_3 = Target.the("Recibir aceptar politicas").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_COMPLETAR =Target.the("Fin del pcoeso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
