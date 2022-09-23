package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.fasttrack.pages.ProductsPage;

public class ProductSteps extends BaseSteps{

    @Step
    public void selectProduct(){
        productsPage.clickProductImage();
        productsPage.checkTheTextOfDescriptionOfTheProduct();
    }

}
