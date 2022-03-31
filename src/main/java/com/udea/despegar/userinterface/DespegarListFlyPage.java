package com.udea.despegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarListFlyPage {

    public static final Target COMPRAR_BUTTON = Target.the("boton de comprar").locatedBy("(//*[@class = 'mobile-container'])[1]");
    public static final Target ANUNCIO_BUTTON = Target.the("boton cerrar opción cambiar fechas").locatedBy("//*[@class = 'eva-3-icon-close tooltip-close']");
    public static final Target CONTINUAR_BUTTON = Target.the("boton sin equipaje de mano").locatedBy("//*[@class = 'eva-3-btn pricebox-sticky-button -lg -primary']");

}
