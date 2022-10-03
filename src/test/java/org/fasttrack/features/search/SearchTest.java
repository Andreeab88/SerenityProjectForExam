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
    cartSteps.addToCartProduct2Steps();
  }


}