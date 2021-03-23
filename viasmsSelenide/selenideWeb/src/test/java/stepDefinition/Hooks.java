package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import static com.codeborne.selenide.Selenide.*;

import java.io.IOException;

import environment.EnvironmentFactory;

public class Hooks {
    EnvironmentFactory environmentFactory = new EnvironmentFactory();

    @Before
    public void setupBrowser() throws IOException {
        environmentFactory.browserConfiguration();
    }

    @After
    public void closeBrowser() {
        clearBrowserCookies();
        clearBrowserLocalStorage();
        closeWebDriver();
    }
}
