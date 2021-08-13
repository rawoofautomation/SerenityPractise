package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.LoginPage;

public class LoginPageSteps {

    private LoginPage loginpage;

    @Step
    public void launchApplication()
    {
        loginpage.open();
    }

    @Step
    public void userLogin()
    {
        loginpage.login();
    }
    @Step
    public void verifyLogin()
    {
        Assert.assertTrue(loginpage.getWindowTitle().equalsIgnoreCase("My account - My Store"));
    }



}
