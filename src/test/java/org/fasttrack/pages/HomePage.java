package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import static org.fasttrack.utils.Constants.productName1;

public class HomePage extends BasePage{

    @FindBy(css = ".site-title a")
    private WebElementFacade siteTitle;

    @FindBy(css = ".search-box > i")
    private WebElementFacade searchBox;

    @FindBy(css = ".search-box form *")
    private WebElementFacade searchBoxInputText;

    @FindBy(css = ".search-box form i")
    private WebElementFacade searchBoxButton;




    public void checkTextSiteTitle(){
siteTitle.shouldContainElements("FASTTRACKIT");
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



}
