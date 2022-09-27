package org.fasttrack.pages;

import net.thucydides.core.pages.PageObject;

public class BasePage extends PageObject {
    public int convertStringToInteger(String element){
        return Integer.parseInt(element
                .replace("15", "")
                .replace(",", "")
                .replace("00", "")
                .replace("lei", ""));

    }

}
