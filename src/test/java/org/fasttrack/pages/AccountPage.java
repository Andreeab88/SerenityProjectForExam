package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("http://qa2.fasttrackit.org:8008")
public class AccountPage extends BasePage{

                                               //for register
    @FindBy(id = "reg_email")
    private WebElementFacade emailRegisterField;

    @FindBy(id = "reg_password")
    private WebElementFacade passRegisterField;

    @FindBy(css = "button[name='register']")
    private WebElementFacade registerButton;

    @FindBy(css = "ul.woocommerce-error li")
    private WebElementFacade errorRegisterMessage;


                                     //for login
    @FindBy(id = "username")
    private WebElementFacade emailField;

    @FindBy(id = "password")
    private WebElementFacade passField;

    @FindBy(id = "rememberme")
    private WebElementFacade rememberMeField;

    @FindBy(css = "button[value='Login']")
    private WebElementFacade loginButton;

    @FindBy(css = ".woocommerce > div[class*=\"woocommerce-\"]")
    private WebElementFacade succesMessageLogin;

    @FindBy(css = "a:-webkit-any-link")
    private WebElementFacade logOutButton;

    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessageForLostPass;

    @FindBy(css = ".lost_password a")
    private WebElementFacade lostPasswordField;

    @FindBy(css = "#user_login")
    private WebElementFacade emailForLostPassField;

    @FindBy(css = "button[value='Reset password']")
    private WebElementFacade resetPassButton;

    @FindBy(css = ".woocommerce > div[class*=\"woocommerce-\"]")
    private WebElementFacade succesMessageForRecoveryTheLostPass;
    @FindBy(css = "h2.entry-title")
    private WebElementFacade titleMyAccountPage;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorWrongUsernameLogin;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorWrongPassLogin;
    @FindBy(css = ".woocommerce-error li strong")
    private WebElementFacade errorNoCredentials;




    public void setEmailRegisterField(String email) {
        typeInto(emailRegisterField, email);
    }

    public void setPassRegisterField(String pass) {
        typeInto(passRegisterField, pass);
    }

    public void clickRegisterButton(){
        clickOn(registerButton);
    }

   public String getErrorRegistertText(){
    return    errorRegisterMessage.getText();
   }

    public void setEmailField(String email) {
        typeInto(emailField, email);
    }

    public void setPassField(String pass) {
        typeInto(passField, pass);
    }

    public void clickRememberMeButton(){
        clickOn(rememberMeField);
    }

    public void clickLoginButton(){
        clickOn(loginButton);

    }
    public String getSuccesMessageLogin(){
      return   succesMessageLogin.getText();
    }

    public void clickLogOutButton(){
        clickOn(logOutButton);
    }

    public String getErrorMessageForLostPass(){
        return   errorMessageForLostPass.getText();
    }

    public void clickOnLostPasswordButton(){
        clickOn(lostPasswordField);
    }

    public void setEmailForLostPassField(String email) {
        waitFor(emailForLostPassField);
        typeInto(emailForLostPassField, email);
    }

    public String getSuccesMessageForRecoveryTheLostPass(){
        return   succesMessageForRecoveryTheLostPass.getText();
    }

public void clickResetPassButton(){
        clickOn(resetPassButton);
}
    public String checkMyAccountPageTitle(){
        return    titleMyAccountPage.getText();
    }

    public String checkErrorTextWrongUsername(){
        return        errorWrongUsernameLogin.getText();
    }
    public String checkErrorTextPass(){
        return    errorWrongPassLogin.getText();
    }
    public String checkErrorTextLoginWithoutCredentials(){
        return    errorNoCredentials.getText();
    }


}
