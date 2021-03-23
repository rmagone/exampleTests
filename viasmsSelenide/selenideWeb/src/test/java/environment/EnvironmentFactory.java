package environment;

import java.io.IOException;
import static com.codeborne.selenide.WebDriverRunner.*;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EnvironmentFactory {
    Environment environment = new Environment();

    public void browserConfiguration() throws IOException {
        Configuration.browser = environment.getBrowser();
        Configuration.timeout = 70000l;
        Configuration.startMaximized = true;
        DesiredCapabilities caps = new DesiredCapabilities();
        if (isChrome() || isOpera()) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-debugging-port=9222");
            caps.setCapability(ChromeOptions.CAPABILITY, options);
            Configuration.browserCapabilities = caps;
        } else if (isFirefox()) {
            Configuration.headless = true;
        }

    }
}
