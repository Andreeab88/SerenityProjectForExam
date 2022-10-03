package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.fasttrack.utils.Constants.USER_EMAIL;
import static org.fasttrack.utils.Constants.USER_PASS;

public class CheckoutSteps extends BaseSteps{

@Step
public void completeCheckoutFormularLoggedIn(String firstName,String lastName){
    checkoutPage.setFirstNameCheckoutFormular(firstName);
    checkoutPage.setLastNameCheckoutFormular(lastName);
    checkoutPage.clickOnBoxCountry();
    checkoutPage.clickForSearchCountry();
    checkoutPage.findCountrytInGridAndOpen("Romania");
    checkoutPage.setAdressCheckoutFormular("Iasi");
    checkoutPage.setCityCheckoutFormular("Iasi");
    checkoutPage.setPostcodeCheckoutFormular("765748");
    checkoutPage.setPhoneNumberCheckoutFormular("0711111111");}
    @Step
    public void setEmailCheckoutFormularLoggedIn(String USER_EMAIL){
    checkoutPage.setEmailCheckoutFormular(USER_EMAIL);}
    @Step
    public void clickToPlaceOrderCheckout(){
    checkoutPage.clickPlaceOrderCheckout();
}


@Step
public void verifyTitlePageOfReceivedOrder(){
    try {
        String expected = "ORDER RECEIVED";
        String actual = checkoutPage.verifyTitleReceivedOrder();
        Assert.assertEquals(expected,actual);
   } catch (Exception e) {
       System.out.println("Something went wrong.");
    } finally {
       System.out.println("The 'try catch' is finished.");
 }

}
    @Step
    public void verifySuccesMessageOfReceivedOrder(){
        String expected = "Thank you. Your order has been received.".toLowerCase();
        String actual = checkoutPage.verifySuccesMessageReceivedOrder().toLowerCase();
        Assert.assertEquals(expected,actual);
    }
    @Step
    public void verifyMessageLoginOnCheckoutPageSteps(String message){
    String expected = "Returning customer? Click here to login".toLowerCase();
    String actual = checkoutPage.verifyMessageNotLoginForCheckout().toLowerCase();
    Assert.assertEquals(expected,actual);
    }
@Step
public void loginOnCheckoutPageSteps(){
    checkoutPage.clickForLoginCheckout();
    checkoutPage.setEmailForLoginCheckout(USER_EMAIL);
    checkoutPage.setPasswordForLoginCheckout(USER_PASS);
    checkoutPage.clickRememberCredentialsButton();
    checkoutPage.clickLoginButtonForCheckout();

}
@Step
    public void verifyCheckoutPageWithNoProductsSteps(){
        homePage.clickOnHomeButton();
        homePage.clickOnCheckoutButton();
    }

}
