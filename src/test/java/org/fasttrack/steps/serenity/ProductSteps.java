package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.yecht.Data;

public class ProductSteps extends BaseSteps{

    @Step
    public void selectProductImage(String productImg){
        productPage.clickProductImage("Album");
    }


    @Step
        public void searchProductByPopularity(){
        homePage.clickShopButton();
        productPage.selectDropDownValues();
    }
    @Step
    public void viewProduct(String productName){
        productPage.findProductInGridAndOpen("Hoogie with Zipper");

    }


}
