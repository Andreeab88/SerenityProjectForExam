package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.fasttrack.utils.Constants.productName1;

public class HomePage extends BasePage{

    @FindBy(css = ".site-title a")
    private WebElementFacade siteTitle;

    @FindBy(css = "#menu-item-64 a")
    private WebElementFacade openMyAccount;

    @FindBy(css = ".search-box > i")
    private WebElementFacade searchBox;

    @FindBy(css = ".search-box form *")
    private WebElementFacade searchBoxInputText;

    @FindBy(css = ".search-box form i")
    private WebElementFacade searchBoxButton;

    @FindBy(css = "#menu-item-66 a")
    private WebElementFacade openShop;
    @FindBy(css = "#menu-item-63 a")
    private WebElementFacade openHome;
    @FindBy(css = "#menu-item-65 a")
    private WebElementFacade openCheckout;
    @FindBy(css = ".dashicons-cart")
    private WebElementFacade openCart;




    public void clickOnMyAccountButton(){
        clickOn(openMyAccount);
    }

    public String checkTextSiteTitle(){
 return siteTitle.getText();
    }

    public void clickOnSearchBox(){
        clickOn(searchBox);
    }

    public void setSearchField(String Text){
        typeInto(searchBoxInputText,productName1);
    }

    public void clickOnSearchButton(){
        clickOn(searchBoxButton);
    }

public void clickOnShopButton(){
        clickOn(openShop);
}
    public void clickOnHomeButton(){
        clickOn(openHome);
    }
    public void clickOnCheckoutButton(){
        clickOn(openCheckout);
    }
    public void clickOnCartButton(){
        clickOn(openCart);
    }





}
