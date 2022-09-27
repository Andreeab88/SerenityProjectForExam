package org.fasttrack.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Pending;
import net.thucydides.core.annotations.Steps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import org.fasttrack.steps.serenity.EndUserSteps;

import static org.fasttrack.utils.Constants.*;


public class SearchTest extends BaseTest{

  @Test
  public void searchProductsInList(){
    searchSteps.findProductsInGridAndOpenStep();
  }
} 