package org.fasttrack.features.search;

import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductsInCart(){
        searchSteps.searchProduct1();
        productSteps.selectProduct();
        cartSteps.setQTY();
        cartSteps.addProductInCart();
    }
}
