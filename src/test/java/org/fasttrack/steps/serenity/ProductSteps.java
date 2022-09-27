package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.ProductsPage;
import org.junit.Assert;

public class ProductSteps extends BaseSteps{

    @Step
    public void selectProductImage(){
        productsPage.clickProductImage();

    }

    @Step
    public void SearchSortedProductsByAscendingPrice(){
        homePage.clickShopButton();
        homePage.clickSortProductsShopButton();
    }



}
