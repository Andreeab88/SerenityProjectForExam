package org.fasttrack.features.search;

import net.thucydides.core.annotations.Step;
import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addToCartTestWithLogin() {
homeSteps.verifyNameSite("FASTTRACKIT");
loginSteps.navigateToHomepage();
homeSteps.goToMyAccount();
loginSteps.loginWithValidCredentialsStep(Constants.USER_EMAIL,Constants.USER_PASS);
        searchSteps.searchProductNameStep();
        productSteps.selectProductImage("Album");
        cartSteps.addProductInCartStep();
        cartSteps.checkSuccessMessageSteps("Album");
        cartSteps.setQtyAndViewCartSteps("2");
        cartSteps.addProductInCartStep();
        productSteps.writeReviewAboutProductAlbum();
        productSteps.writeReviewAboutProductAlbum2();
        productSteps.writeReviewAboutProductAlbum3();
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
        productSteps.checkErrorWriteReviewWithoutLoggIn();
    }
    @Test
    public void addMoreProductsInCartTestWhitoutLogin1() {
        homeSteps.verifyNameSite("FASTTRACKIT");
        searchSteps.searchProductNameStep();
        productSteps.selectProductImage("Album");
        cartSteps.addProductInCartStep();
        cartSteps.checkSuccessMessageAddMoreProductsInCartSteps("9999999999999999","Album");
        cartSteps.setQtyAndViewCartSteps("9999999999999999");
        cartSteps.addProductInCartStep();
        homeSteps.goToCart();
        cartSteps.setQtyInCartPage2("0");
       cartSteps.UpdateCartStep();
       homeSteps.goToHomeButton();
        }
    @Test
    public void add2ProductsInCartAndCheckSubtotalAndTotalTest(){

        homeSteps.goToShop();
        cartSteps.addProduct1InCartSteps("Hoodie with Logo");
        cartSteps.addProduct1InCartSteps1("2");
        cartSteps.addProduct1InCartSteps2("Hoodie with Logo");
        cartSteps.checkSuccesMessageProducts1IsInCartSteps("Hoodie with Logo");
        cartSteps.addToCartProducts1Step();

        cartSteps.navigateToShopPage();

        cartSteps.addProducts2InCartSteps("Hoodie with Zipper");
        cartSteps.checkSuccesMessageProducts2IsInCartSteps("Hoodie with Zipper");
        cartSteps.addToCartProduct2Steps();
      cartSteps.setQtyInCartPage1("2");
        cartSteps.checkSubtotalPriceStep();
        cartSteps.checkShip();

        cartSteps.checkTotalPriceStep();
        cartSteps.checkTotal();
    }

    @Test
    public void applyWrongCouponTest(){
        cartSteps.navigateToShopPage();
        cartSteps.addProducts2InCartSteps("Hoodie with Zipper");
        cartSteps.checkSuccesMessageProducts2IsInCartSteps("Hoodie with Zipper");
        cartSteps.addToCartProduct2Steps();
        cartSteps.setQtyInCartPage1("2");

        cartSteps.apllyWrongCouponSteps1("woo-hoodie-with-zipper");
        cartSteps.apllyWrongCouponSteps();
        cartSteps.checkErrorMessageWrongCouponSteps("woo-hoodie-with-zipper");
   }
   @Test
    public void removeProductFromCartTest(){
       cartSteps.navigateToShopPage();
       cartSteps.addProducts2InCartSteps("Hoodie with Zipper");
       cartSteps.checkSuccesMessageProducts2IsInCartSteps("Hoodie with Zipper");
       cartSteps.addToCartProduct2Steps();
       cartSteps.setQtyInCartPage1("2");
        cartSteps.clickOnToRemoveProductFromCart();
        cartSteps.checkSuccesMessageRemoveProductFromCartSteps();
        homeSteps.goToHomeButton();
    }
@Test
    public void checkIfCheckoutIsAvailableWithEmptyCart(){

}


    }
