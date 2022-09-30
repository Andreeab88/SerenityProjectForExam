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

    @FindBy(css = "span a.star-5")
    private WebElementFacade reviewStarsdAboutproductAlbum;

    @FindBy(css = "#comment")
    private WebElementFacade reviewCommentField;

    @FindBy(css = "#input")
    private WebElementFacade submitReviewCommentField;

    @FindBy(css = ".woocommerce-review__awaiting-approval.description")
    private WebElementFacade succesMessageReviewProductAlbum;

@FindBy(css = "ul.page-numbers:nth-child(4)")
private List<WebElementFacade> listOfProductsFromProductPage;

    @FindBy(css = "#quantity_6336e86a762e5")
    private WebElementFacade qtyProducts1;

    @FindBy(css = ".quantity [value='26']")
private WebElementFacade addToCartProducts1;
    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageProducts1InCart;
    @FindBy(css = "a.button.wc-forward")
    private WebElementFacade viewCartProducts1;
    @FindBy(css = "#quantity_633707013f9a9")
    private WebElementFacade qtyProducts2;
    @FindBy(css = "#quantity_633707013f9a9 button")
    private WebElementFacade addToCartProducts2;
    @FindBy(css = ".wcm-main.woocommerce-message")
    private WebElementFacade successMessageProducts2InCart;
    @FindBy(css = ".widget_shopping_cart_content ul li")
    private WebElementFacade viewCartProducts2;
    @FindBy(css = "#pro-preview .item a")
    private WebElementFacade viewCartProducts2a;



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
    public void selectProducts1FromListAndSelect(String itemName) {
        for (WebElementFacade element : listOfProductsFromProductPage) {
            if (element.findElement(By.cssSelector(".item.post-26 a.title")).getText().equalsIgnoreCase(itemName)) {
                element.findElement(By.cssSelector(".item.post-26 a.title")).click();
                break;
            }
        }
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
    public void selectProducts2FromListAndSelect(String itemName) {
        for (WebElementFacade element : listOfProductsFromProductPage) {
            if (element.findElement(By.cssSelector(".item.post-22 a.title")).getText().equalsIgnoreCase(itemName)) {
                element.findElement(By.cssSelector(".item.post-22 a.title")).click();
                break;
            }
        }
    }
    public void setInputQtyProducts2(String quantity2) {
        typeInto(qtyProducts2, quantity2);
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


}