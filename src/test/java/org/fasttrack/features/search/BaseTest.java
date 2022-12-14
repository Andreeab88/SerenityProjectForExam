package org.fasttrack.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrack.steps.serenity.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


    @RunWith(SerenityRunner.class)
    public class BaseTest {

        @Managed(uniqueSession = true)
        public WebDriver driver;


        @Steps
        protected SearchSteps searchSteps;
        @Steps
        protected CartSteps cartSteps;
        @Steps
        protected LoginSteps loginSteps;
        @Steps
        protected CheckoutSteps checkoutSteps;
        @Steps
        protected HomeSteps homeSteps;
        @Steps
        protected ProductSteps productSteps;
        @Steps
        protected RegisterSteps registerSteps;
        @Steps
        protected AccountSteps accountSteps;



        @Before
        public void init() {
            driver.manage().window().maximize();
            driver.get("http://qa2.fasttrackit.org:8008");
        }

        public static void wait(int seconds){
            try{
                Thread.sleep(seconds*1000L);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        public void waitABit(long delayInMilliseconds) {
            try {
                Thread.sleep(delayInMilliseconds);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
