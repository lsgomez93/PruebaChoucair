package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class SearchCoursePage extends PageObject {

    public static final Target MENU_BUTTON = Target.the("Hace clic en el menu")
            .located(By.cssSelector(".d-inline-block.mr-3 button[type='button']"));
    public static final Target ITEM_COURSE = Target.the("selecciona curso del menu")
            .located(By.cssSelector("a[data-key='1279']"));
    public static final Target NAME_COURSE = Target.the("Extrae el nombre de el curso")
            .located(By.xpath("//div[@class='page-header-headings']"));
}
