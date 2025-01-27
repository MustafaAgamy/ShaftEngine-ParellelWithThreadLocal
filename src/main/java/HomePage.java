import com.shaft.driver.SHAFT;
import org.openqa.selenium.By;

public class HomePage {
    private SHAFT.GUI.WebDriver driver;

    private final By welcomeMessage_h2 = By.id("welcomeMessage");
    private final By clickMe_Button = By.id("clickMe");
    private final By signOut_Button = By.id("signOut");
    private final By buttonClickedMessage_h2 = By.id("buttonClickedMessage");
    private final By signOutMessage_h2 = By.id("signOutMessage");

    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    public HomePage signOut() {
        driver.element().click(signOut_Button);
        return this;
    }

    public HomePage clickMe() {
        driver.element().click(clickMe_Button);
        return this;
    }

    public HomePage verifyUserIsOnHomePage(String welcomeMessage) {
        driver.element().assertThat(welcomeMessage_h2).text().isEqualTo(welcomeMessage);
        return this;
    }

    public HomePage verifyButtonIsClicked(String buttonClickedMessage) {
        driver.assertThat().element(buttonClickedMessage_h2).text().isEqualTo(buttonClickedMessage);
        return this;
    }

    public HomePage verifyUserIsSingedOut(String signOutMessage) {
        driver.element().assertThat(signOutMessage_h2).text().isEqualTo(signOutMessage);
        return this;
    }

}
