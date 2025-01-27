import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelThreadLocalTest {
    private ThreadLocal<SHAFT.GUI.WebDriver> driver = new ThreadLocal<>();
    private SHAFT.TestData.JSON testData;

    @Test
    public void signOutTest() {
        new HomePage(driver.get())
                .signOut()
                .verifyUserIsSingedOut(testData.getTestData("signOutText"));
    }

    @Test
    public void buttonClickTest() {
        new HomePage(driver.get())
                .clickMe()
                .verifyButtonIsClicked(testData.getTestData("buttonClickedText"));
    }

    @BeforeClass
    public void beforeClassSetup() {
        testData = new SHAFT.TestData.JSON("TestData.json");
    }

    @BeforeMethod
    public void beforeMethodSetUp() {
        driver.set(new SHAFT.GUI.WebDriver());
        driver.get().browser().navigateToURL(SHAFT.Properties.paths.testData() + "loginPage.html");
        new LoginPage(driver.get())
                .login(testData.getTestData("email"),
                        testData.getTestData("password"));
        new HomePage(driver.get())
                .verifyUserIsOnHomePage(testData.getTestData("welcomeMessageText"));


    }

    @AfterMethod
    public void afterMethodTearDown() {
        driver.get().quit();
    }
}
