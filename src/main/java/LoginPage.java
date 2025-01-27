import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class LoginPage {
    private SHAFT.GUI.WebDriver driver;

    private final By email_Input = By.id("email");
    private final By password_Input = By.id("password");
    private final By login_Button = By.id("login");

    public LoginPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage login(String email, String password) {
        driver.element().type(email_Input, email);
        driver.element().type(password_Input, password);
        driver.element().click(login_Button);
        return this;
    }

}
