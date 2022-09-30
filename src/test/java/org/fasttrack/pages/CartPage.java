package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = "p.cart-empty")
    private WebElementFacade emptyCart;

    @FindBy(css = "i.dashicons.dashicons-menu")
    private WebElementFacade menuButton;

    @FindBy(css = "#menu-main")
    private List<WebElementFacade> menuList;

    @FindBy(css = ".product-subtotal.amount")
    private List<WebElementFacade> subtotalProductsList;

    @FindBy(css = ".cart-subtotal td")
    private WebElementFacade subtotalCartPrices;
    @FindBy(css = ".shipping.amount")
    private WebElementFacade shippingTax;
    @FindBy(css = "tr.order-total.amount")
    private WebElementFacade totalCartPrice;
    @FindBy(css = "#coupon-code")
    private WebElementFacade couponCode;
    @FindBy(css = ".coupon input.coupon")
    private WebElementFacade applyCoupon;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessageWrongCoupon;
    @FindBy(css = "checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckout;
    @FindBy(css = "#data-product_id=26")
    private WebElementFacade removeProductFromCart;
    @FindBy(css = "div.woocommerce-message a")
    private WebElementFacade succesMessageRemoveProductFromCart;
    @FindBy(css = "a.button wc-backward")
    private WebElementFacade returnToShopButton;
    @FindBy(css = "div.woocommerce-info")
    private WebElementFacade errorCheckoutMessageCartEmpty;



    public void verifyEmptyCart() {
        emptyCart.shouldContainOnlyText("Your cart is currently empty.");
    }
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
    public int getSubtotalFromProductsList() {
        int sum = 0;
        for (WebElementFacade elementFacade : subtotalProductsList) {
            sum += convertStringToInteger(elementFacade.getText());
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
