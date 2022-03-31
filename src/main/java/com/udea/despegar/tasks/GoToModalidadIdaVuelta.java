package com.udea.despegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static com.udea.despegar.userinterface.DespegarHomePage.*;

public class GoToModalidadIdaVuelta implements Task {

    private Target checkIdaVuelta;

    public GoToModalidadIdaVuelta(Target checkIdaVuelta) {
        this.checkIdaVuelta = checkIdaVuelta;
    }

    public static Performable checkSelecSoloIdaVuelta(Target checkSoloIdaVuelta) {
        return Tasks.instrumented(GoToModalidadIdaVuelta.class, checkSoloIdaVuelta);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(checkIdaVuelta),
                Click.on(COOKIES_BUTTON)
        );
    }
}
