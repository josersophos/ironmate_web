package task;

import models.Registro_datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static userInterface.PaginaInicio.*;

public class Registro_task implements Task    {

    private Registro_datos datos;
    public Registro_task(Registro_datos datos) {
        this.datos = datos;
    }
    public static Registro_task registro_task (Registro_datos datos){
        return Tasks.instrumented(Registro_task.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                JavaScriptClick.on(Menu_elements),
                JavaScriptClick.on(Web_Tables),
                JavaScriptClick.on(Add_Registro),
                Enter.theValue(datos.getStrNombre()).into(First_Name),
                Enter.theValue(datos.getStrApellido()).into(Last_Name),
                Enter.theValue(datos.getStrEmail()).into(User_Email),
                Enter.theValue(datos.getStrEdad()).into(Age),
                Enter.theValue(datos.getStrSalario()).into(Salary),
                Enter.theValue(datos.getStrDepartamento()).into(Department),
                JavaScriptClick.on(Submit),
                JavaScriptClick.on(Delete_record1)
        );
    }

}
