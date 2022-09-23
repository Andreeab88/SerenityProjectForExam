package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.HomePage;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.productName1;

public class SearchSteps extends BaseSteps{


    @Step
    public void searchProduct1(){
        homePage.clickSearchBox();
        homePage.setSearchField(productName1);
        homePage.clickSearchButton();
    }

}
