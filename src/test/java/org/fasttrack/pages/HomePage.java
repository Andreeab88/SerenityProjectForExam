package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.fasttrack.utils.Constants.productName1;

public class HomePage extends BasePage{

    @FindBy(css = ".site-title a")
    private WebElementFacade siteTitle;

    @FindBy(css = "#menu-item-64 a")
    private WebElementFacade myAccountButton;

    @FindBy(css = ".search-box > i")
    private WebElementFacade searchBox;

    @FindBy(css = ".search-box form *")
    private WebElementFacade searchBoxInputText;

    @FindBy(css = ".search-box form i")
    private WebElementFacade searchBoxButton;

    @FindBy(css = ".main #menu li a")
    private WebElementFacade shopButton;

    @FindBy(css = "select.orderby [value='price']")
    private WebElementFacade sortProductsShopButton;




    public void clickOnMyAccountButton(){
        clickOn(myAccountButton);
    }

    public String checkTextSiteTitle(){
 return siteTitle.getText();
    }

    public void clickSearchBox(){
        clickOn(searchBox);
    }

    public void setSearchField(String Text){
        typeInto(searchBoxInputText,productName1);
    }

    public void clickSearchButton(){
        clickOn(searchBoxButton);
    }

public void clickShopButton(){
        clickOn(shopButton);
}

    public void clickSortProductsShopButton(){
        clickOn(sortProductsShopButton);
    }

}
