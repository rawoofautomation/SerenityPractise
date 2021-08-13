package steps;

import net.thucydides.core.annotations.Step;
import pages.AccountPage;

public class AccountPageSteps {

    AccountPage accountPageSteps;

    @Step
    public void validateAccountPage() {
        accountPageSteps.fetchText();
    }

    @Step
    public Boolean validateProduct(String product_key, String product_name) {
        return accountPageSteps.search(product_key, product_name);
    }

}
