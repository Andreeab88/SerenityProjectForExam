package org.fasttrack.features.search;

import org.junit.Test;


public class SearchTest extends BaseTest{

  @Test
  public void searchProductsInListTest(){
    searchSteps.searchProductNameStep();
    searchSteps.findProductsInGridAndOpenStep("hoodie");
  }

  @Test
  public void searchProductByPopularityTest(){
    homeSteps.verifyNameSite("FASTTRACKIT");
    productSteps.searchProductByPopularity();
    productSteps.viewProduct("Hoogie with Zipper");
  }



 //// @Test
 // public void loginSearchSelectRandom(){
 //   loginSteps.doLogin("danzanf@yahoo.com","abc123");
  //  loginSearchSelectRandomSteps.clickOnCookieAcceptButton();
  //  searchSteps.doSearch("aroma");
  //  loginSearchSelectRandomSteps.totalNumberOfPages();
   /// loginSearchSelectRandomSteps.randomPageNumber();
  //  loginSearchSelectRandomSteps.navigateToRandomPage();
   // loginSearchSelectRandomSteps.checkThatIsAtLeastOneProductInStockOnPage();
   // loginSearchSelectRandomSteps.randomProduct();
   // loginSearchSelectRandomSteps.selectAndAddToCart();
  //  loginSearchSelectRandomSteps.navigateToCartPage();
  //  loginSearchSelectRandomSteps.checkCartPage();
  //  loginSearchSelectRandomSteps.compareSelectedProductWithCartProduct();
   // loginSearchSelectRandomSteps.emptyCartBeforeExit();
 // }
} 