package co.com.choucair.certification.pruebaingreso.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class uTestsStepDefinitions {

@Before
public  void setStage(){
    OnStage.setTheStage(new OnlineCast());

}

    @Given("^What Jorge wants is to register  on the page,to learn about creation and deployment of tests$")
    public void whatJorgeWantsIsToRegisterOnThePageToLearnAboutCreationAndDeploymentOfTests() {
            OnStage.theActorCalled("Jorge").wasAbleTo(AbrirPagina.thePage());
    }

    @When("^Access the registration form and follow each step by filling field$")
    public void accessTheRegistrationFormAndFollowEachStepByFillingField(List<UtestDatos>datos) throws Exception {
            OnStage.theActorInTheSpotlight().attemptsTo(Llenar.thePage(datos),LlenarDir.thePage(datos), LlenarDisp.thePage(datos), LlenarLast.thePage(datos));

    }

    @Then("^The form is completed by clicking on the button “Setup complete “$")
    public void theFormIsCompletedByClickingOnTheButtonSetupComplete() {



    }


}
