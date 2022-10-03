package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CheckoutPage extends BasePage{



    @FindBy(css = "#billing_first_name")
    private WebElementFacade firstNameCheckoutFormular;

    @FindBy(css = "#billing_last_name")
    private WebElementFacade lastNameCheckoutFormular;

    @FindBy(css = "span.selection")
    private WebElementFacade boxCountry;

    @FindBy(css = "span.select2-selection__arrow b")
    private WebElementFacade searchCountry;

    @FindBy(css = "li.select2-results_option.select2-results__option--highlighted")
    private List<WebElementFacade> selectCountry;
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
    @FindBy(css = ".woocommerce #payment #place_order")
    private WebElementFacade placeOrder;
    @FindBy(css = "#main h2.entry-title")
    private WebElementFacade titleReceivedOrder;
    @FindBy(css = "section.woocommerce-order-details p")
    private WebElementFacade succesMessageReceivedOrder;
    @FindBy(css = "div.woocommerce-info")
    private WebElementFacade messageNotLoginForCheckout;
    @FindBy(css = "#username")
    private WebElementFacade emailForLoginCheckout;
    @FindBy(css = "#password")
    private WebElementFacade passwordForLoginCheckout;
    @FindBy(css = "#rememberme")
    private WebElementFacade rememberButtonForLoginCheckout;

    @FindBy(css = ".button[name='login']")
    private WebElementFacade loginButtonForCheckout;

    @FindBy(css = "div.woocommerce-info a.showlogin")
    private WebElementFacade clickForLoginCheckout;






    public void setFirstNameCheckoutFormular(String firstName){
        typeInto(firstNameCheckoutFormular,firstName);
    }
    public void setLastNameCheckoutFormular(String lastName){
        typeInto(lastNameCheckoutFormular,lastName);
    }

    public void clickOnBoxCountry(){
        clickOn(boxCountry);
    }
    public void clickForSearchCountry(){
        clickOn(searchCountry);
    }

    public boolean findCountrytInGridAndOpen(String country){
        for (WebElementFacade element : selectCountry){
            if (element.getText().equalsIgnoreCase(country)){
                element.click();
                return true;
            }
        }
        return false;
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

        return titleReceivedOrder.getTextContent();
}
    public String verifySuccesMessageReceivedOrder(){
        return succesMessageReceivedOrder.getText();
    }
    public String verifyMessageNotLoginForCheckout(){
        return messageNotLoginForCheckout.getText();
    }

    public void clickForLoginCheckout(){
        clickOn(clickForLoginCheckout);
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
