package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AccountPage extends PageObject {


    public void fetchText() {
/*
        WebElement e = $("//h1");
        shouldBeVisible(e);
*/
        shouldBeVisible(By.xpath("//h1"));
    }

    public Boolean search(String product_key, String product_name) {
        typeInto($("#search_query_top"), product_key);
        waitForTextToAppear(product_name).clickOn($("//li[text()='" + product_name + "']"));
        //li[text()='Casual Dresses > Printed Dress']
        return find(By.tagName("h1")).getText().equalsIgnoreCase("Casual Dresses > Printed Dress");
        //shouldBeVisible(By.xpath("//h1"));

    }


}
