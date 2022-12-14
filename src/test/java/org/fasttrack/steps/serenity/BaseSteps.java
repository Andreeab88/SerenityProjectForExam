package org.fasttrack.steps.serenity;

import net.thucydides.core.steps.ScenarioSteps;
import org.fasttrack.pages.*;

public class BaseSteps extends ScenarioSteps {

    protected AccountPage accountPage;

    protected HomePage homePage;

    protected SearchResultsPage searchResultsPage;
    protected ProductPage productPage;
    protected CartPage cartPage;
    protected CheckoutPage checkoutPage;





    public static void main(String[] args) throws Exception {
        try {
            assert args.length > 0;
        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
    }
}


