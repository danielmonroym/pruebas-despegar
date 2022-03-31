package com.udea.despegar.stepdefinitions;

import com.udea.despegar.enums.MsgError;
import com.udea.despegar.exceptions.ExceptionError;
import com.udea.despegar.questions.GetText;
import com.udea.despegar.tasks.FillInformation;
import com.udea.despegar.tasks.GoToModalidadIdaVuelta;
import com.udea.despegar.tasks.SelectFly;
import com.udea.despegar.userinterface.DespegarHomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static com.udea.despegar.userinterface.DespegarHomePage.*;
import static com.udea.despegar.userinterface.DespegarListFlyPage.*;
import static com.udea.despegar.userinterface.DespegarSuccesMsmPage.MESSAGE_TO_COMPARE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static com.udea.despegar.utils.Action.waitForSecond;

public class DespegarStepDefinition {

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
    }

    @Given("{string} desea ir a la pagina de despegar")
    public void deseaIrALaPaginaDeDespegar(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.browserOn(new DespegarHomePage()));
    }

    @When("Ingresa la informacion de busqueda del vuelo {string} y {string}")
    public void ingresaLaInformacionDeBusquedaDelVueloY(String origen, String destino) {
        theActorInTheSpotlight().attemptsTo(GoToModalidadIdaVuelta.checkSelecSoloIdaVuelta(CHECK_IDA_VUELTA));
        theActorInTheSpotlight().attemptsTo(FillInformation.fly(origen,destino, ORIGEN_FIELD, DESTINO_FIELD));
        waitForSecond(6);
        theActorInTheSpotlight().attemptsTo(SelectFly.selectBuyButton(COMPRAR_BUTTON,CONTINUAR_BUTTON));
    }

    @Then("se valida el mensaje {string}")
    public void seValidaElMensaje(String mensaje) {
        theActorInTheSpotlight().should(seeThat(GetText.field(MESSAGE_TO_COMPARE), equalTo(mensaje))
                .orComplainWith(ExceptionError.class, String.format(MsgError.MSG_ERROR_TEXT.getMsg(), mensaje,
                        GetText.field(MESSAGE_TO_COMPARE).answeredBy(theActorInTheSpotlight()))));
    }

}
