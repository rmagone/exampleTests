package helpers;

import static org.junit.Assert.assertEquals;

import com.codeborne.selenide.Condition;

import pages.LoanPage;

public class LoanPageHelper {

    LoanPage loanPage = new LoanPage();

    public void validateLoanPageLabels() {
        assertEquals("Imiona *", loanPage.getNameLabel().shouldBe(Condition.visible).getText());
        assertEquals("Nazwisko *", loanPage.getSurnameLabel().shouldBe(Condition.visible).getText());
        assertEquals("PESEL *", loanPage.getPersonalCodeLabel().shouldBe(Condition.visible).getText());
        assertEquals("Dokument tożsamości", loanPage.getDocumentTypeLabel().shouldBe(Condition.visible).getText());
        assertEquals("Numer dokumentu tożsamości *",
                loanPage.getDocumentNumberLabel().shouldBe(Condition.visible).getText());
        assertEquals("Email *", loanPage.getEmailLabel().shouldBe(Condition.visible).getText());
        assertEquals("Kraj zamieszkania *", loanPage.getCountryLabel().shouldBe(Condition.visible).getText());
        assertEquals("Numer telefonu komórkowego *",
                loanPage.getPhoneNumberLabel().shouldBe(Condition.visible).getText());
        assertEquals("Kod PIN *", loanPage.getSmsCodeLabel().shouldBe(Condition.visible).getText());
    }

    public void validateTermsAndConsents() {
        loanPage.getAgreeToPartnerMarketingCheckbox().scrollIntoView(true).shouldBe(Condition.visible);
        loanPage.getAgreeToPartnerMarketingText().scrollIntoView(true).shouldBe(Condition.visible);
        loanPage.getAgreeToPartnerMarketingTooltip().scrollIntoView(true).shouldBe(Condition.visible);
        loanPage.getAgreeToMarketingCheckbox().scrollIntoView(true).shouldBe(Condition.visible);
        loanPage.getAgreeToMarketingText().scrollIntoView(true).shouldBe(Condition.visible);
        loanPage.getAgreeToMarketingTooltip().scrollIntoView(true).shouldBe(Condition.visible);
        loanPage.getAgreeToTermsCheckbox().scrollIntoView(true).shouldBe(Condition.visible);
        loanPage.getAgreeToTermsText().scrollIntoView(true).shouldBe(Condition.visible);
    }

    public void validateInputFields() {
        loanPage.getNameLabel().shouldBe(Condition.visible);
        loanPage.getSurnameLabel().shouldBe(Condition.visible);
        loanPage.getPersonalCodeLabel().shouldBe(Condition.visible);
        loanPage.getDocumentTypeLabel().shouldBe(Condition.visible);
        loanPage.getDocumentNumberLabel().shouldBe(Condition.visible);
        loanPage.getEmailLabel().shouldBe(Condition.visible);
        loanPage.getCountryLabel().shouldBe(Condition.visible);
        loanPage.getPhoneNumberLabel().shouldBe(Condition.visible);
        loanPage.getSmsCodeLabel().shouldBe(Condition.visible);
    }

    public void enterPersonalCode(String personalCode) {
        loanPage.getPersonalCodeInputField().sendKeys(personalCode);
        loanPage.getNameInputField().click();
    }

    public void errorMessageIsShown() {
        loanPage.getErrorMessageText().should(Condition.visible);
    }
}