package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class HomeSteps extends BaseSteps{
    @Step
    public void verifyNameSite(String titleOfTheSite){
homePage.checkTextSiteTitle();
    }

    @Step
    public void goToHomeButton(){
        homePage.clickOnHomeButton();
    }
    @Step
    public void goToMyAccount(){
        homePage.clickOnMyAccountButton();
    }

    @Step
    public void goToCheckout(){
        homePage.clickOnCheckoutButton();
    }

    @Step
    public void goToCart(){
        homePage.clickOnCartButton();
    }

    @Step
    public void goToShop(){
        homePage.clickOnShopButton();
    }
}
