package com.udea.despegar.tasks;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.udea.despegar.userinterface.DespegarHomePage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillInformation implements Task {
    private Target fieldfOrigen;
    private Target fieldDestino;
    private String origen;
    private String destino;

    public FillInformation(String origen, String destino, Target fieldfOrigen, Target fieldDestino) {
        this.fieldfOrigen = fieldfOrigen;
        this.fieldDestino = fieldDestino;
        this.origen = origen;
        this.destino = destino;

    }

    public static Performable fly(String origen, String destino, Target fieldfOrigen, Target fieldDestino) {
        return Tasks.instrumented(FillInformation.class, origen, destino,fieldfOrigen,fieldDestino);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(fieldfOrigen),
                Enter.theValue(origen).into(ORIGEN_FIELD),
                Hit.the(Keys.ENTER).into(ORIGEN_FIELD),
                Click.on(fieldDestino),
                Enter.theValue(destino).into(DESTINO_FIELD),
                Hit.the(Keys.ENTER).into(DESTINO_FIELD),


                Click.on(FECHA_IDA_FIELD),
                Click.on(FECHA_IDA_SELECT),
                Click.on(FECHA_VUELTA_FIELD),
                Click.on(FECHA_VUELTA_SELECT),
                Click.on(APLICAR_BUTTON),

                Click.on(BUSCAR_BUTTON)


        );
    }
}
