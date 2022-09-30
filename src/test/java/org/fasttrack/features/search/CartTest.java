package org.fasttrack.features.search;

import net.thucydides.core.annotations.Step;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTestWithLogin() {
homeSteps.verifyNameSite("FASTTRACKIT");
loginSteps.loginWithValidCredentialsStep(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchProductNameStep();
        productSteps.selectProductImage("Album");
        cartSteps.addProductInCartStep();
        cartSteps.checkSuccessMessageSteps("Album");
        cartSteps.setQtyAndViewCartSteps("2");
        cartSteps.addProductInCartStep();
        productSteps.writeReviewAboutProductAlbum();
        productSteps.checkSuccesMessageReview();
    }



    @Test
    public void addProductsInCartTestWhitoutLogin() {
        homeSteps.verifyNameSite("FASTTRACKIT");
        searchSteps.searchProductNameStep();
        productSteps.selectProductImage("Album");
        cartSteps.addProductInCartStep();
        cartSteps.checkSuccessMessageSteps("Album");
        cartSteps.setQtyAndViewCartSteps("2");
        cartSteps.addProductInCartStep();
        productSteps.writeReviewAboutProductAlbum();
        productSteps.checkSuccesMessageReview();
        homeSteps.goToCart();
        cartSteps.emptyCartSteps();
    }
    @Test
    public void add2ProductsInCartAndCheckSubtotalAndTotalTest(){

        homeSteps.goToShop();
        cartSteps.addProduct1InCartSteps("Polo");
        cartSteps.checkSuccesMessageProducts1IsInCartSteps("Polo");
        cartSteps.addToCartProducts1Step();

        cartSteps.navigateToShopPages();

        cartSteps.addProducts2InCartSteps("Sunglasses");
        cartSteps.checkSuccesMessageProducts2IsInCartSteps("Sunglasses");
        cartSteps.addToCartProduct2Steps();

        cartSteps.emptyCartSteps();
        cartSteps.checkSubtotalPriceStep();
        cartSteps.checkTotalPriceStep();
    }

   @Test
    public void applyWrongCouponTest(){
        cartSteps.apllyWrongCouponSteps();
        cartSteps.checkErrorMessageWrongCouponSteps();
   }
   @Test
    public void removeProductFromCartTest(){
        cartSteps.clickOnToRemoveProductFromCart();
        cartSteps.checkSuccesMessageRemoveProductFromCartSteps();
        cartSteps.returnToShopStep();
    }
@Test
    public void checkIfCheckoutIsAvailableWithEmptyCart(){

}


    }
