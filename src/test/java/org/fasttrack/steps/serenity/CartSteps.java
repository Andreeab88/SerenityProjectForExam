package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

import static org.fasttrack.utils.Constants.Qty1;

public class CartSteps extends BaseSteps{

    @Step
    public void setQTY(){
        productsPage.setInputQty(Qty1);
    }
    @Step
    public void addProductInCart(){
productsPage.clickCartButton();
productsPage.checkSuccesMessageProductIsInCart();
productsPage.clickViewCart();
    }
}
