package com.udea.despegar.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.despegar.com.co/")
public class DespegarHomePage extends PageObject {

    public static final Target COOKIES_BUTTON = Target.the("boton de las cookies").locatedBy("//*[@class = 'lgpd-banner--button eva-3-btn -white -md']");
    public static final Target CHECK_IDA_VUELTA = Target.the("check de selección ida y vuelta").locatedBy("(//span[@class='radio-label'])[1]");
    public static final Target ORIGEN_FIELD = Target.the("campo origen").locatedBy("(//*[@placeholder = 'Ingresa desde dónde viajas'])[1]");
    public static final Target DESTINO_FIELD = Target.the("campo destino").locatedBy("(//*[@placeholder = 'Ingresa hacia dónde viajas'])[1]");
    public static final Target FECHA_IDA_FIELD = Target.the("campo fecha ida").locatedBy("(//*[@class = 'input-tag'])[3]");
    public static final Target FECHA_VUELTA_FIELD = Target.the("campo fecha regreso").locatedBy("(//*[@class = 'input-tag'])[4]");
    public static final Target FECHA_IDA_SELECT = Target.the("opcion de fecha de salida").locatedBy("//*[@id='component-modals']/div[1]/div[1]/div[2]/div[2]/div[3]/div[28]");
    public static final Target FECHA_VUELTA_SELECT = Target.the("opcion de fecha de regreso").locatedBy("//*[@class = 'sbox5-monthgrid-datenumber sbox5-monthgrid-datenumber-30 -weekday']");
    public static final Target APLICAR_BUTTON = Target.the("boton para aplicar las fechas escogidas").locatedBy("(//*[@class = 'btn-text'])[5]");
    public static final Target BUSCAR_BUTTON = Target.the("boton para buscar los vuelos disponibles").locatedBy("(//*[@class = 'btn-text'])[4]");
}