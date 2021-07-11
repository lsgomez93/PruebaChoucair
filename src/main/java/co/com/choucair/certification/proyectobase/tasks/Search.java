package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;



public class Search implements Task {
    public Search(String course) {
        this.course = course;
    }

    private String course;
    public static Search the(String course) {
        return Tasks.instrumented(Search.class, course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchCoursePage.MENU_BUTTON),
                Click.on(SearchCoursePage.ITEM_COURSE)
        );
    }
}
