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

        productPage.findProductInGridAndOpen1(product1Name);
    }

    @Step
    public void addProduct1InCartSteps1(String quantity1){
        productPage.setInputQtyProducts1(quantity1);}

    @Step
    public void addProduct1InCartSteps2(String product1Name){
        productPage.clickOnAddToCartButtonOfProducts1();
    }

    @Step
    public void checkSuccesMessageProducts1IsInCartSteps(String product1Name){
    String expected ="2 × “"+ product1Name +"” have been added to your cart.";
    String actual = productPage.checkSuccesMessageProducts1IsInCart();
    System.out.println(expected);
    System.out.println(actual);
    Assert.assertEquals(expected,actual);
}
@Step
    public void addToCartProducts1Step(){
        homePage.clickOnCartButton();
        //productPage.clickOnViewCartButtonProducts1();
}
@Step
    public void navigateToShopPage(){
       homePage.clickOnHomeButton();
       homePage.clickOnShopButton();

}
    @Step
    public void addProducts2InCartSteps(String products2Name){
        productPage.findProductInGridAndOpen2(products2Name);
        productPage.setInputQtyProducts2("2");
        productPage.clickOnAddToCartButtonOfProducts2();
    }
    @Step
    public void checkSuccesMessageProducts2IsInCartSteps(String products2Name){
        String expected ="2 × “"+ products2Name +"” have been added to your cart.";
        String actual = productPage.checkSuccesMessageProducts2IsInCart();
        System.out.println(expected);
        System.out.println(actual);
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void addToCartProduct2Steps(){
        homePage.clickOnCartButton();
        //productPage.clickOnViewCartButtonProducts2();
      //  productPage.clickOnViewCartButtonProducts2a();
    }

    @Step
    public void setQtyInCartPage1(String qtyFomCartPage){
        cartPage.setQtyInCartPage1(qtyFomCartPage);
        cartPage.setQtyInCartPage2(qtyFomCartPage);
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
    public void checkShip(){
        String expected = "10,00 lei";
        String actual = cartPage.checkshiptax();
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void checkTotal(){
        String expected = "190,00 lei";
        String actual = cartPage.checktotal();
        Assert.assertEquals(expected,actual);
    }

    @Step
    public void apllyWrongCouponSteps(){
        cartPage.clickApplyWrongCouponButton();}
    @Step
    public void apllyWrongCouponSteps1(String coupon){
        cartPage.setWrongCouponCode(coupon);
    }
    @Step
    public void checkErrorMessageWrongCouponSteps(String prodName){
        String expected = "Coupon \"woo-hoodie-with-zipper\" does not exist!";
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
        String expected = "“Hoodie with Zipper” removed. Undo?";
        String actual =cartPage.getSuccesMessageRemoveProductFromCart();
                Assert.assertEquals(expected,actual);
    }

@Step
    public void checkIfCheckoutIsAvailableWithCartEmpty(){
    String expected = "Checkout is not available whilst your cart is empty.";
    String actual =cartPage.getErrorCheckoutEmptyCart();
    Assert.assertEquals(expected,actual);
}


}


