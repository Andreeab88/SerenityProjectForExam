package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.Qty1;
import static org.fasttrack.utils.Constants.productName1;

public class CartSteps extends BaseSteps{


    @Step
    public void addProductInCartStep(){
productPage.clickCartButton();
    }

    @Step
public void checkSuccessMessageSteps(String productName1) {
    String expected ="“"+ productName1 +"” has been added to your cart.";
    String actual = productPage.checkSuccesMessageProductIsInCart();
    System.out.println(expected);
    System.out.println(actual);
    Assert.assertEquals(expected,actual);
}

    @Step
    public void setQtyAndViewCartSteps(String Qty1){
        productPage.setInputQty(Qty1);
        productPage.clickViewCartButton();
    }

    @Step
    public void addProduct1InCartSteps(String product1Name){
        productPage.selectProducts1FromListAndSelect("Polo");
        productPage.setInputQtyProducts1("2");
        productPage.clickOnAddToCartButtonOfProducts1();
    }
@Step
    public void checkSuccesMessageProducts1IsInCartSteps(String product1Name){
    String expected ="2 x “"+ product1Name +"” have been added to your cart.".toLowerCase();
    String actual = productPage.checkSuccesMessageProducts1IsInCart().toLowerCase();
    System.out.println(expected);
    System.out.println(actual);
    Assert.assertEquals(expected,actual);
}
@Step
    public void addToCartProducts1Step(){
        productPage.clickOnViewCartButtonProducts1();
}
@Step
    public void navigateToShopPages(){
        cartPage.clickOnMenuButton();
        cartPage.selectItemFromList("Shop");
}
    @Step
    public void addProducts2InCartSteps(String products1Name){
        productPage.selectProducts2FromListAndSelect("Polo");
        productPage.setInputQtyProducts2("2");
        productPage.clickOnAddToCartButtonOfProducts2();
    }
    @Step
    public void checkSuccesMessageProducts2IsInCartSteps(String products2Name){
        String expected ="2 x “"+ products2Name +"” have been added to your cart.".toLowerCase();
        String actual = productPage.checkSuccesMessageProducts2IsInCart().toLowerCase();
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void addToCartProduct2Steps(){
        productPage.clickOnViewCartButtonProducts2();
        productPage.clickOnViewCartButtonProducts2a();
    }
    @Step
    public void emptyCartSteps(){
        homePage.open();
        cartPage.verifyEmptyCart();
    }
    @Step
    public void checkSubtotalPriceStep(){
        Assert.assertTrue(cartPage.checkIfSubtotalsMatches());
    }
    @Step
    public void checkTotalPriceStep(){
        Assert.assertTrue(cartPage.checkIfTotalPricesMatches());
    }
    @Step
    public void apllyWrongCouponSteps(){
        cartPage.clickApplyWrongCouponButton();
        cartPage.setWrongCouponCode("woo-polo");
    }
    @Step
    public void checkErrorMessageWrongCouponSteps(){
        String expected = "Coupon \"woo-polo\" does not exist!";
        String actual = cartPage.getErrorMessageAboutWrongCoupon();
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void clickOnProceedToCheckoutStep(){
        cartPage.clickOnCheckoutButton();
    }
    @Step
    public void clickOnToRemoveProductFromCart(){
        cartPage.clickRemoveProductFromCart();
    }
    @Step
    public void checkSuccesMessageRemoveProductFromCartSteps(){
        String expected = "“Sunglasses” removed. Undo?";
        String actual =cartPage.getSuccesMessageRemoveProductFromCart();
                Assert.assertEquals(expected,actual);
    }
    @Step
    public void returnToShopStep(){
        cartPage.clickReturnToShopButton();
    }
@Step
    public void checkIfCheckoutIsAvailableWithCartEmpty(){
    String expected = "Checkout is not available whilst your cart is empty.";
    String actual =cartPage.getErrorCheckoutEmptyCart();
    Assert.assertEquals(expected,actual);
}


}


