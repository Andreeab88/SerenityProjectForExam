package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {


    @FindBy(css = "remove.remove_from_cart_button")
    private WebElementFacade removeProductFromCartHomePage;

    @FindBy(css = "i.dashicons.dashicons-menu")
    private WebElementFacade menuButton;

    @FindBy(css = "#menu-main")
    private List<WebElementFacade> menuList;

    @FindBy(css = ".woocommerce .shop_table input.qty")
    private WebElementFacade qtyInCartPage1;

    @FindBy(css = ".woocommerce .shop_table input.qty")
    private WebElementFacade qtyInCartPage2;

    @FindBy(css = "td.product-subtotal")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".cart_totals td")
    private WebElementFacade subtotalCartPrices;
    @FindBy(css = "[data-title='Shipping'] span.amount")
    private WebElementFacade shippingTax;
    @FindBy(css = "tr.order-total span.amount")
    private WebElementFacade totalCartPrice;
    @FindBy(css = "#coupon_code")
    private WebElementFacade couponCode;
    @FindBy(css = "input.button")
    private WebElementFacade applyCoupon;
    @FindBy(css = "ul.woocommerce-error li")
    private WebElementFacade errorMessageWrongCoupon;
    @FindBy(css = "checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckout;
    @FindBy(css = "td.product-remove a.remove")
    private WebElementFacade removeProductFromCart;
    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade succesMessageRemoveProductFromCart;
    @FindBy(css = "a.button wc-backward")
    private WebElementFacade returnToShopButton;
    @FindBy(css = "div.woocommerce .woocommerce-info")
    private WebElementFacade errorCheckoutMessageCartEmpty;




    public void clickOnMenuButton() {
        clickOn(menuButton);
    }
    public void selectItemFromList(String itemName) {
        for (WebElementFacade element : menuList) {
            if (element.findElement(By.cssSelector("#menu-item-66 a")).getText().equalsIgnoreCase(itemName)) {
                element.findElement(By.cssSelector("#menu-item-66 a")).click();
                break;
            }
        }
    }

    public void setQtyInCartPage1(String qtyFromCartPage){
        typeInto(qtyInCartPage1,qtyFromCartPage);
    }
    public void setQtyInCartPage2(String qtyFromCartPage){
        typeInto(qtyInCartPage1,qtyFromCartPage);
    }


    public int getSubtotalFromProductsList() {
        int sum = 0;
        for (WebElementFacade elementFacade : subtotalProductsList) {
            sum+= convertStringToInteger(elementFacade.getText());
        }
        return sum;
    }

    public boolean checkIfSubtotalsMatches() {
        int expected = getSubtotalFromProductsList();
        int actual = convertStringToInteger(subtotalCartPrices.getText());
        return expected == actual;
    }

    public boolean checkIfTotalPricesMatches() {
        int subtotal = getSubtotalFromProductsList();
        int fee = convertStringToInteger(shippingTax.getText());
        int expectedTotal = subtotal + fee;
        int actualTotal = convertStringToInteger(totalCartPrice.getText());
        return expectedTotal == actualTotal;
    }
public String checkshiptax(){
    return    shippingTax.getText();
}
    public String checktotal(){
      return  totalCartPrice.getText();
    }


    public void setWrongCouponCode(String wrongCouponCode) {
        typeInto(couponCode, wrongCouponCode);
    }

    public void clickApplyWrongCouponButton() {
        clickOn(applyCoupon);
    }

    public String getErrorMessageAboutWrongCoupon() {
        return errorMessageWrongCoupon.getText();
    }

    public void clickOnCheckoutButton() {
        waitABit(500);
        clickOn(proceedToCheckout);
    }

    public void clickRemoveProductFromCart() {
        clickOn(removeProductFromCart);
    }

    public String getSuccesMessageRemoveProductFromCart() {
        return succesMessageRemoveProductFromCart.getText();
    }

    public void clickReturnToShopButton() {
        clickOn(returnToShopButton);
    }
    public String getErrorCheckoutEmptyCart() {
        return errorCheckoutMessageCartEmpty.getText();
    }

}
