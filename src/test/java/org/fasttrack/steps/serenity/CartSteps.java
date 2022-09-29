package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.Qty1;
import static org.fasttrack.utils.Constants.productName1;

public class CartSteps extends BaseSteps{


    @Step
    public void addProductInCart(){
productPage.clickCartButton();
    }

    @Step
public void checkSuccessMessage(String productName1) {
    String expected ="“"+ productName1 +"” has been added to your cart.";
    String actual = productPage.checkSuccesMessageProductIsInCart();
    System.out.println(expected);
    System.out.println(actual);
    Assert.assertEquals(expected,actual);
}

    @Step
    public void setQtyAndViewCart(String Qty1){
        productPage.setInputQty(Qty1);
        productPage.clickViewCartButton();
    }



}
