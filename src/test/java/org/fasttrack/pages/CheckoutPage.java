package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CheckoutPage extends BasePage{

    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameCheckoutFormular;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameCheckoutFormular;
    @FindBy(css = "#select2-billing_country-container")
    private List<WebElementFacade> dropDown_CountryCheckoutFormular;
    @FindBy(css = "#billing_address_1")
    private WebElementFacade adressCheckoutFormular;
    @FindBy(css = "#billing_city")
    private WebElementFacade cityCheckoutFormular;
    @FindBy(css = "#billing_postcode")
    private WebElementFacade postcodeCheckoutFormular;
    @FindBy(css = "#billing_phone")
    private WebElementFacade phoneNumberCheckoutFormular;
    @FindBy(css = "#billing_email")
    private WebElementFacade emailCheckoutFormular;
    @FindBy(css = "#place_order")
    private WebElementFacade placeOrder;
    @FindBy(css = "h2.entry-title")
    private WebElementFacade titleReceivedOrder;
    @FindBy(css = ".woocommerce-thankyou-order-received")
    private WebElementFacade succesMessageReceivedOrder;
    @FindBy(css = ".woocommerce-info.showlogin")
    private WebElementFacade messageNotLoginForCheckout;
    @FindBy(css = "#username")
    private WebElementFacade emailForLoginCheckout;
    @FindBy(css = "#password")
    private WebElementFacade passwordForLoginCheckout;
    @FindBy(css = "#rememberme")
    private WebElementFacade rememberButtonForLoginCheckout;
    @FindBy(css = ".button[name='login']")
    private WebElementFacade loginButtonForCheckout;





    public void setFirstNameCheckoutFormular(String firstName){
        typeInto(firstNameCheckoutFormular,firstName);
    }
    public void setLastNameCheckoutFormular(String lastName){
        typeInto(firstNameCheckoutFormular,lastName);
    }

    public void selectDropDownCountry(){
        for(WebElementFacade elementFacade: dropDown_CountryCheckoutFormular){
            elementFacade.selectByValue("Romania");
        }
    }
    public void setAdressCheckoutFormular(String adress){
        typeInto(adressCheckoutFormular,adress);
    }
    public void setCityCheckoutFormular(String city){
        typeInto(cityCheckoutFormular,city);
    }
    public void setPostcodeCheckoutFormular(String postcode){
        typeInto(postcodeCheckoutFormular,postcode);
    }
    public void setPhoneNumberCheckoutFormular(String phoneNumber){
        typeInto(phoneNumberCheckoutFormular,phoneNumber);
    }
    public void setEmailCheckoutFormular(String email){
        typeInto(emailCheckoutFormular,email);
    }
public void clickPlaceOrderCheckout(){
        clickOn(placeOrder);
}
public String verifyTitleReceivedOrder(){
        return titleReceivedOrder.getText();
}
    public String verifySuccesMessageReceivedOrder(){
        return succesMessageReceivedOrder.getText();
    }
    public String verifyMessageNotLoginForCheckout(){
        return succesMessageReceivedOrder.getText();
    }
    public void setEmailForLoginCheckout(String email){
        typeInto(emailForLoginCheckout,email);
    }
    public void setPasswordForLoginCheckout(String password){
        typeInto(passwordForLoginCheckout,password);
    }
    public void clickRememberCredentialsButton(){
        clickOn(rememberButtonForLoginCheckout);
    }
    public void clickLoginButtonForCheckout(){
        clickOn(loginButtonForCheckout);
    }




}
