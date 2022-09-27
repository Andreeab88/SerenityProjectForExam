package org.fasttrack.features.search;

import net.thucydides.core.annotations.Step;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void addProductsInCart() {
        searchSteps.searchProduct1();
        productSteps.selectProductImage();
        cartSteps.addProductInCart();
        cartSteps.checkSuccessMessage();
        cartSteps.setQTY();
        wait(3);
        cartSteps.viewCart();
    }

    @Step
    public void addSortedProductsCartAndAfterRemoveItFromCart(){
       // homeSteps.checkNameSite();
        productSteps.SearchSortedProductsByAscendingPrice();
    }
    }
