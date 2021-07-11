package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static final Target LOGIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class='btn btn-info btn-sm text-white']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("where do we write the user")
            .located(By.name("username"));
    public static final Target INPUT_PASSWORD = Target.the( "where do we write the password")
            .located(By.id("password"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login")
            .located(By.cssSelector(".sign-up-btn.text-center button[type='submit']"));


}
