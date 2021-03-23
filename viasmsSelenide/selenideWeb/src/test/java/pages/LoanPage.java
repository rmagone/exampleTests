package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;
import lombok.Data;

@Data
public class LoanPage {
    /*labels */
public SelenideElement nameLabel = $(By.xpath("//input[@name = 'name']//preceding-sibling::label[@class='label']"));
public SelenideElement surnameLabel = $(By.xpath("//input[@name = 'surname']//preceding-sibling::label[@class='label']"));
public SelenideElement personalCodeLabel = $(By.xpath("//input[@name = 'pesel']//preceding-sibling::label[@class='label']"));
public SelenideElement documentTypeLabel = $(By.xpath("//select[@name = 'document_type']/ancestor::label/preceding-sibling::label[@class='label']"));
public SelenideElement documentNumberLabel = $(By.xpath("//input[@name = 'document-number']//preceding-sibling::label[@class='label']"));
public SelenideElement emailLabel = $(By.xpath("//input[@name = 'email']//preceding-sibling::label[@class='label']"));
public SelenideElement countryLabel = $(By.xpath("//select[@name = 'country']/ancestor::label/preceding-sibling::label[@class='label']"));
public SelenideElement phoneNumberLabel = $(By.xpath("//div[@class = 'phone-row']//preceding-sibling::label[@class='label']"));
public SelenideElement smsCodeLabel = $(By.xpath("//input[@name = 'smscode']//preceding-sibling::label[@class='label']"));

/*checkboxes */
public SelenideElement agreeToPartnerMarketingCheckbox = $(By.cssSelector("input[name='consents[first_step][51]'][type='checkbox']"));
public SelenideElement agreeToPartnerMarketingText = $(By.xpath("//input[@type='checkbox' and @name='consents[first_step][51]']/ancestor::label"));
public SelenideElement agreeToPartnerMarketingTooltip = $(By.xpath("//input[@type='checkbox' and @name='consents[first_step][51]']/ancestor::label/following-sibling::div[@class='open-tooltip']"));
public SelenideElement agreeToMarketingCheckbox = $(By.cssSelector("input[name='consents[first_step][17]'][type='checkbox']"));
public SelenideElement agreeToMarketingText = $(By.xpath("//input[@type='checkbox' and @name='consents[first_step][17]']/ancestor::label"));
public SelenideElement agreeToMarketingTooltip = $(By.xpath("//input[@type='checkbox' and @name='consents[first_step][17]']/ancestor::label/following-sibling::div[@class='open-tooltip']"));
public SelenideElement agreeToTermsCheckbox = $(By.cssSelector("input[name='consents[first_step][19]'][type='checkbox']"));
public SelenideElement agreeToTermsText = $(By.xpath("//input[@type='checkbox' and @name='consents[first_step][19]']/ancestor::label"));

/*input fields */
public SelenideElement nameInputField = $(By.xpath("//input[@name = 'name']"));
public SelenideElement surnameInputField = $(By.xpath("//input[@name = 'surname']"));
public SelenideElement personalCodeInputField = $(By.xpath("//input[@name = 'pesel']"));
public SelenideElement documentTypeDropDown = $(By.xpath("//select[@name = 'document_type']"));
public SelenideElement documentNumberInputField = $(By.xpath("//input[@name = 'document-number']"));
public SelenideElement emailInputField = $(By.xpath("//input[@name = 'email']"));
public SelenideElement countryDropDown = $(By.xpath("//select[@name = 'country']"));
public SelenideElement phoneNumberInputField = $(By.xpath("//input[@name = 'phone']"));
public SelenideElement smsCodeInputField = $(By.xpath("//input[@name = 'smscode']"));

/*Error message */
public SelenideElement errorMessageText = $(By.cssSelector(".error-msg"));

}