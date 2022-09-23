package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;

public class HomeSteps extends BaseSteps{
    @Step
    public void checkNameSite(){
        homePage.checkTextSiteTitle();
    }
}
