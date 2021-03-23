package stepDefinition;

import io.cucumber.java.en.*;
import static com.codeborne.selenide.Selenide.*;

import environment.Environment;
import helpers.LoanPageHelper;

public class LoanPageSteps {
    Environment env = new Environment();
    LoanPageHelper loanPageHelper = new LoanPageHelper();

    @Given("I lunch loan page")
    public void launchLoanPage() throws InterruptedException {
        open("https://vialet.pl/register");
    }

    @Then("I validate field labels")
    public void validateFieldLabels() {
        loanPageHelper.validateLoanPageLabels();
    }

    @Then("I validate input fields")
    public void validateInputFields() {
        loanPageHelper.validateInputFields();
    }

    @Then("I validate terms and consents")
    public void validateTermsAndConsents() {
        loanPageHelper.validateTermsAndConsents();
    }

    @When("^I enter personal code (.*)$")
    public void enterPersonalCode(String personalCode){
            loanPageHelper.enterPersonalCode(personalCode);
    }
    
    @Then("Error message is shown")
    public void errorMessageIsShown(){
        loanPageHelper.errorMessageIsShown();
    }
}
