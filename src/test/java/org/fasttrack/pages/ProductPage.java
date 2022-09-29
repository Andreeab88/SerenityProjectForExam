package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.yecht.Data;

import java.util.List;

public class ProductPage extends BasePage {

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



    @FindBy(css = ".woocommerce-ordering select")
    private List<WebElementFacade> dropDown_SortProductsShopButton;

    @FindBy(css = ".product-details")
    private List<WebElementFacade>  listProductName;

    @FindBy(css = ".woocommerce div.product form.cart div.quantity")
    private WebElementFacade inputQtyProduct;

    @FindBy(css = ".woocommerce .cart .button")
    private WebElementFacade addToCartButton;







    public void clickProductImage(String productImg) {
        clickOn(productImage);
    }
    public void clickCartButton() {
        clickOn(cartButton);
    }
    public String checkSuccesMessageProductIsInCart() {
        return successMessageProductInCart.getText().replace("View cart\n", "");
    }
    public void setInputQty(String number) {
        typeInto(inputQty, number);
    }
    public void clickViewCartButton() {
        clickOn(viewCartButton);

    }


    public void selectDropDownValues(){
        for(WebElementFacade elementFacade: dropDown_SortProductsShopButton){
           elementFacade.selectByValue("popularity");
        }

    }

    public boolean findProductInGridAndOpen(String productName){
            for (WebElementFacade element : listProductName){
                if (element.getText().equalsIgnoreCase(productName)){
                    element.click();
                    return true;
                }
            }
            return false;
        }


    public void setInputQtyProduct(String number) {
        typeInto(inputQtyProduct, number);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }

        }