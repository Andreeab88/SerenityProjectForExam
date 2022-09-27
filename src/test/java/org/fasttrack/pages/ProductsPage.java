package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;


import static org.fasttrack.utils.Constants.productName1;
import static org.fasttrack.utils.Constants.productName3;

public class ProductsPage extends BasePage {

    @FindBy(css = ".entry-thumb img")
    private WebElementFacade productImage;


    @FindBy(css = "input[type=number i]")
    private WebElementFacade inputQty;

    @FindBy(css = ".woocommerce .cart .button")
    private WebElementFacade cartButton;

    @FindBy(css = ".woocommerce .woocommerce-message")
    private WebElementFacade successMessageProductInCart;


    @FindBy(css = ".woocommerce .product .summary .cart .button ")
    private WebElementFacade viewCartButton;


    public void clickProductImage() {
        clickOn(productImage);
    }


    public void clickCartButton() {
        clickOn(cartButton);
    }

    public String checkSuccesMessageProductIsInCart() {
        System.out.println(successMessageProductInCart.getText());
        return successMessageProductInCart.getText().replace("View cart\n", "");
    }


    public void setInputQty(String number) {
        typeInto(inputQty, number);
    }

    public void clickViewCartButton() {
        clickOn(viewCartButton);

    }
}