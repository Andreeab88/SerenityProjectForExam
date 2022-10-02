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
        productPage.clickOnReviewButton();}
    @Step
    public void writeReviewAboutProductAlbum1(){
        productPage.clickOnReviewStarsAboutProductAlbumButton();}
    @Step
    public void writeReviewAboutProductAlbum2(){
        productPage.setReviewCommentAboutProductAlbum("great!");}
    @Step
    public void writeReviewAboutProductAlbum3(){
        productPage.clickSubmitReviewCommentButton();
    }
@Step
public void checkSuccesMessageReview(){
    String expected ="Your review is awaiting approval";
    String actual = productPage.checkSuccesMessageReviewAboutProductAlbum();
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

    @Step
    public void checkErrorWriteReviewWithoutLoggIn(){
        String expected = "You must be logged in to post a review.".toLowerCase();
        String actual = productPage.getErrorWriteReviewWhitoutLoggIn().toLowerCase();
        Assert.assertEquals(expected,actual);
    }




}
