package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.Qty1;
import static org.fasttrack.utils.Constants.productName1;

public class CartSteps extends BaseSteps{


    @Step
    public void addProductInCart(){
productsPage.clickCartButton();


    }


@Step
public void checkSuccessMessage() {
    String expected ="“"+ productName1 +"” has been added to your cart.";
    String actual = productsPage.checkSuccesMessageProductIsInCart();
    System.out.println(expected);
    System.out.println(actual);
    Assert.assertEquals(expected,actual);
}

    @Step
    public void setQTY(){
        productsPage.setInputQty(Qty1);
    }

public void viewCart(){
    productsPage.clickViewCartButton();
}

}
