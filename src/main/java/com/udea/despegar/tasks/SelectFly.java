package com.udea.despegar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectFly implements Task {

    private Target buttonBuy;
    private Target buttonAnuncio;
    private Target buttonContinuar;

    public SelectFly(Target buttonBuy, Target buttonAnuncio, Target buttonContinuar) {
        this.buttonBuy = buttonBuy;
        this.buttonAnuncio = buttonAnuncio;
        this.buttonContinuar = buttonContinuar;
    }

    public static Performable selectBuyButton(Target buyButton, Target buttonAnuncio, Target buttonContinuar) {
        return Tasks.instrumented(SelectFly.class, buyButton,buttonAnuncio,buttonContinuar);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
//                WaitUntil.the(buttonAnuncio,isVisible()).forNoMoreThan(20).seconds(),
//                Click.on(buttonAnuncio),

                WaitUntil.the(buttonBuy,isVisible()).forNoMoreThan(10).seconds(),
                Click.on(buttonBuy),
                Click.on(buttonContinuar)
        );
    }
}
