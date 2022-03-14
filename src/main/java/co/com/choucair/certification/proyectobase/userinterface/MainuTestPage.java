package co.com.choucair.certification.proyectobase.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/")
    public class MainuTestPage extends PageObject {
        public static final Target JOIN = Target.the("Register Button ").located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
