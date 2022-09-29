package org.fasttrack.features.search;

import net.thucydides.core.annotations.Step;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductsInCartTest() {
        searchSteps.navigateToProductName();
        productSteps.selectProductImage("Album");
        cartSteps.addProductInCart();
        cartSteps.checkSuccessMessage("Album");
        cartSteps.setQtyAndViewCart("2");

    }

    @Test
    public void searchProductByPopularityTest(){
       homeSteps.checkNameSite("FASTTRACKIT");
       productSteps.searchProductByPopularity();
       productSteps.viewProduct("Hoogie with Zipper");
    }
    }
