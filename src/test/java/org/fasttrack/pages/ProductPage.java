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

    @FindBy(css = ".button.wc-forward")
    private WebElementFacade addToCartButton;

    @FindBy(css = "#tab-title-reviews")
    private WebElementFacade openReviewField;

    @FindBy(css = "span a.star-5")
    private WebElementFacade reviewStarsdAboutproductAlbum;

    @FindBy(css = "#comment")
    private WebElementFacade reviewCommentField;

    @FindBy(css = "#submit")
    private WebElementFacade submitReviewCommentField;

    @FindBy(css = "#comment-664 em")
    private WebElementFacade succesMessageReviewProductAlbum;

@FindBy(css = ".product-details a.title")
private List<WebElementFacade> listProduct1;

    @FindBy(css = "input[type=number]")
    private WebElementFacade qtyProducts1;

    @FindBy(css = ".woocommerce div.product form.cart .button")
private WebElementFacade addToCartProducts1;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageProducts1InCart;
    @FindBy(css = ".woocommerce-message a.button")
    private WebElementFacade viewCartProducts1;

    @FindBy(css = ".product-details a.title")
    private List<WebElementFacade> listProduct2;
    @FindBy(css = "input[type=number]")
    private WebElementFacade qtyProduct2;
    @FindBy(css = ".woocommerce div.product form.cart .button")
    private WebElementFacade addToCartProducts2;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageProducts2InCart;
    @FindBy(css = ".button.wc-forward")
    private WebElementFacade viewCartProducts2;
    @FindBy(css = "#pro-preview .item a")
    private WebElementFacade viewCartProducts2a;
    @FindBy(css = "#respond p")
    private WebElementFacade errorWriteReviewWithoutLoggIn;



    public void clickProductImage(String productImg) {
        clickOn(productImage);
    }
    public void clickCartButton() {
        clickOn(cartButton);
    }
    public String checkSuccesMessageProductIsInCart() {
        return successMessageProductInCart.getText().replace("View cart\n", "");
    }
    public void setInputQty(String Qty) {
        typeInto(inputQty, Qty);
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


    public void setInputQtyProduct(String Qty1) {
        typeInto(inputQtyProduct, Qty1);
    }

    public void clickAddToCartButton() {
        clickOn(addToCartButton);
    }
    public void clickOnReviewButton() {
        clickOn(openReviewField);
    }

    public void clickOnReviewStarsAboutProductAlbumButton() {
        clickOn(reviewStarsdAboutproductAlbum);
    }

    public void setReviewCommentAboutProductAlbum(String comment) {
        typeInto(reviewCommentField, comment);
    }

    public void clickSubmitReviewCommentButton() {
        clickOn(submitReviewCommentField);
    }

    public String checkSuccesMessageReviewAboutProductAlbum() {
        return succesMessageReviewProductAlbum.getText();}


    public boolean findProductInGridAndOpen1(String productName){
        for (WebElementFacade element : listProduct1){
            if (element.getText().equalsIgnoreCase(productName)){
                element.click();
                return true;
            }
        }
        return false;
    }


    public void setInputQtyProducts1(String quantity1) {
                typeInto(qtyProducts1, quantity1);
            }

            public void clickOnAddToCartButtonOfProducts1() {
                clickOn(addToCartProducts1);
            }

            public String checkSuccesMessageProducts1IsInCart() {
                return successMessageProducts1InCart.getText().replace("View cart\n", "");
            }

            public void clickOnViewCartButtonProducts1() {
                clickOn(viewCartProducts1);
            }


    public boolean findProductInGridAndOpen2(String productName){
        for (WebElementFacade element : listProduct2){
            if (element.getText().equalsIgnoreCase(productName)){
                element.click();
                return true;
            }
        }
        return false;
    }

            public void setInputQtyProducts2(String quantity2) {
                typeInto(qtyProduct2, quantity2);
            }

            public void clickOnAddToCartButtonOfProducts2() {
                clickOn(addToCartProducts2);
            }

            public String checkSuccesMessageProducts2IsInCart() {
                return successMessageProducts2InCart.getText().replace("View cart\n", "");
            }

            public void clickOnViewCartButtonProducts2() {
                clickOn(viewCartProducts2);
            }

            public void clickOnViewCartButtonProducts2a() {
                clickOn(viewCartProducts2a);
            }

            public String getErrorWriteReviewWhitoutLoggIn() {
                return errorWriteReviewWithoutLoggIn.getText();
            }

        }
