package org.fasttrack.features.search;

import org.junit.Test;


public class SearchTest extends BaseTest{

  @Test
  public void searchProductsInListTest(){
    searchSteps.findProductsInGridAndOpenStep("hoodie");
  }
} 