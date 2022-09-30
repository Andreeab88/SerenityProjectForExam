package org.fasttrack.steps.serenity;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.yecht.Data;

import static org.fasttrack.utils.Constants.Qty1;

public class ProductSteps extends BaseSteps{

    @Step
    public void selectProductImage(String productImg){
        productPage.clickProductImage("Album");
    }
    @Step
    public void writeReviewAboutProductAlbum(){
        productPage.clickOnReviewStarsAboutProductAlbumButton();
        productPage.setReviewCommentAboutProductAlbum("The best!");
        productPage.clickSubmitReviewCommentButton();
    }
@Step
public void checkSuccesMessageReview(){
    String expected ="Your review is awaiting approval\n" +
            "\n" +
            "The best!";
    String actual = productPage.checkSuccesMessageReviewAboutProductAlbum();
    System.out.println(expected);
    System.out.println(actual);
    Assert.assertEquals(expected,actual);
}


    @Step
        public void searchProductByPopularity(){
        homePage.clickOnShopButton();
        productPage.selectDropDownValues();
    }
    @Step
    public void viewProduct(String productName){
        productPage.findProductInGridAndOpen("Hoogie with Zipper");
productPage.setInputQtyProduct(Qty1);
productPage.clickAddToCartButton();

    }



}
