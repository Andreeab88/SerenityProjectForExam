package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;


import static org.fasttrack.utils.Constants.productName1;

public class ProductsPage extends BasePage{

    @FindBy(css = "a img")
    private WebElementFacade productImage;

    @FindBy(css = ".woocommerce div.product .summary .product_title:after")
    private WebElementFacade descriptionOfTheProduct;

    @FindBy(css = "input[type=number i]")
    private WebElementFacade inputQty;

    @FindBy(css = ".woocommerce .cart .button")
    private WebElementFacade cartButton;

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageProductInCart;

    @FindBy(css = "a.button.wc-forward")
    private WebElementFacade viewCart;



    public void clickProductImage(){
        clickOn(productImage);
    }

    public void checkTheTextOfDescriptionOfTheProduct(){
       descriptionOfTheProduct.shouldContainElements(productName1 + "15,00 lei This is a simple, virtual product.");
    }

    public void setInputQty(String number){
     typeInto(inputQty,number);
    }

    public void clickCartButton(){
        clickOn(cartButton);
    }

    public void checkSuccesMessageProductIsInCart(){
        successMessageProductInCart.shouldContainElements("2 ×" + productName1 + "have been added to your cart.");
    }

    public void clickViewCart(){
        clickOn(viewCart);
    }


}
