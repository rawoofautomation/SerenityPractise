package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

//@DefaultUrl("http://automationpractice.com/index.php?controller=authentication&back=my-account")
public class LoginPage extends PageObject {

    public void login()
    {
        $("#email").sendKeys("test@test764.com");
        $("#passwd").sendKeys("Rawoof786");
        $("#SubmitLogin").click();
    }

    public String getWindowTitle()
    {
        return getTitle();
    }

}
