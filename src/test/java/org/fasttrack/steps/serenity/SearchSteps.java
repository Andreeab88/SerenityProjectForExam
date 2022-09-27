package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.productName1;
import static org.fasttrack.utils.Constants.productName2;

public class SearchSteps extends BaseSteps{


    @Step
    public void searchProduct1(){
        homePage.clickSearchBox();
        homePage.setSearchField(productName1);
        homePage.clickSearchButton();
    }

    @Step
    public void findProductsInGridAndOpenStep(){
        searchResultsPage.searchProductsInList(productName2);

    }
}
