package com.sophos.gft.stepDefinitions;

import models.Registro_datos;
import questions.ValidateTextField;
import task.Registro_task;
import userInterface.PaginaInicio;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.equalTo;


public class RegistroStepDefinitions {

    @Before
    public void setUp(){ WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Given("^El cliente debe estar en la pagina principal de demoqa$")
    public void elClienteDebeEstarEnLaPaginaPrincipalDe(List<Registro_datos> datos) throws Throwable {
                theActorCalled("actor").wasAbleTo(Open.browserOn(new PaginaInicio()));
    }
    @When("^ingresar datos del usuario$")
    public void ingresarDatosDelUsuario(List<Registro_datos> datos) {
        theActorInTheSpotlight().attemptsTo(Registro_task.registro_task(datos.get(0)));
    }
    @Then("^se visualiza que quede ingresado el registro$")
    public void seVisualizaQueQuedeIngresadoElRegistro(List<Registro_datos> datos) {
        theActorInTheSpotlight().should(seeThat(ValidateTextField.withDatos(datos.get(0)),
                equalTo(datos.get(0).getStrEmail())));
    }

   /* @After
    public void clos() {
        WebDriverManager.chromedriver().quit();
    }*/

}
