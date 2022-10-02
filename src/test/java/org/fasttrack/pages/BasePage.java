package org.fasttrack.pages;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


public class BasePage extends PageObject {



        public int convertStringToInteger(String element){
        return Integer.parseInt(element
              .replaceAll(" lei", "")
                .replaceAll(",", ""));
    }

    public int convertStringToInteger2(String element){
        return Integer.parseInt(element
                .replaceAll(" lei", "")
                .replaceAll(",", ""));
    }




}
