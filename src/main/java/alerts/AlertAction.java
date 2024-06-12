package alerts;

import models.Registro_datos;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;


import java.util.List;

public class AlertAction implements Performable {


    @Override
    public <T extends Actor> void performAs(T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().alert();
    }
    public Performable andDismiss(){
        return Task.where("{0} dismisses the alert dialog",
        actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss()
        );
    }
    public static Performable andAccept() {
        return Task.where("{0} accepts the alert dialog",
                actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept()
        );
    }

    public static Performable sendKeys(List<Registro_datos> datos) {
    return Task.where("{0} insert text the alert dialog",
            actor -> BrowseTheWeb.as(actor).getDriver().switchTo().alert().sendKeys(
                    datos.get(0).getStrNombre())
    );
}
}


