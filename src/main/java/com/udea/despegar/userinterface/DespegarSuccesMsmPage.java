package com.udea.despegar.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class DespegarSuccesMsmPage {
    public static final Target MESSAGE_TO_COMPARE = Target.the("campo a comparar")
            .locatedBy("(//*[contains(text(),'¿Quiénes viajan?')])[1]");

}
