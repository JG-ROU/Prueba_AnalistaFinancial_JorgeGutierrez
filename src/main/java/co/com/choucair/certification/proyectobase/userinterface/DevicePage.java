package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicePage  {
    public  static final Target CONTENEDOR_DISP_MOV = Target.the("Selecciona movil").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));
    public static final Target DISP_MOVIL =Target.the("Elige uno").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));
    public  static final Target CONTENEDOR_MODEL = Target.the("Selecciona Modelo").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]"));
    public static final Target MODEL =Target.the("Elige uno").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));
    public  static final Target CONTENEDOR_OS = Target.the("Selecciona SO").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));
    public static final Target OS =Target.the("Elige uno").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));
    public static  final Target BUTTON_FINAL = Target.the("Casi terminas").located(By.xpath("//a[@class='btn btn-blue pull-right']"));


}
