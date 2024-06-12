package questions;

import models.Registro_datos;
import userInterface.PaginaInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class ValidateTextField implements Question<String> {

    private Registro_datos datos;

    public ValidateTextField(Registro_datos datos) {
        this.datos = datos;
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PaginaInicio.Validate_Registro.of(datos.getStrEmail())).viewedBy(actor).asString();

    }

    public static ValidateTextField withDatos(Registro_datos registroDatos){
        return new ValidateTextField(registroDatos);
    }
}
