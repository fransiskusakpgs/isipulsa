package com.mycompany.isipulsa.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.hamcrest.text.X;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Fransiskus A K on 27/12/2016.
 */
@DefaultUrl("https://www.blibli.com/")
public class HomePage extends PageObject {

    @FindBy(xpath = "html/body//a[contains(@class ,'bg-tealish')]")
    private WebElementFacade buttonIsiPulsa;

    @FindBy(xpath ="html/body//button[contains(text(),'Coba sekarang')]" )
    private WebElementFacade buttonCobaSekarang;

    @FindBy(xpath = "html/body/ng-view/section[1]/div[1]/div[2]/ul/li[1]/a")
    private WebElementFacade buttonPulsa;

    @FindBy(xpath = "html/body//input[contains(@id,'desk-pulsa-textfield-number')]")
    private WebElementFacade fieldNoHP;

    @FindBy (xpath = "html/body/ng-view/section[1]/div[1]/div[3]/form/div[2]/div[1]/img")
    private WebElementFacade buttonUbahNominal;

//    @FindBy (xpath = "html/body//span[contains(text(),'Rp 20,000')]")
//    private WebElementFacade buttonNominal;

    @FindBy (xpath = "html/body/ng-view/section[1]/div[1]/div[3]/form/div[3]/div/img" )
    private WebElementFacade buttonUbahPembayaran;

    @FindBy (xpath = "html/body/ng-view/section[1]/div[1]/div[3]/form/div[3]/div/div/div/span[3]/select")
    private WebElementFacade buttonBayarLainnya;

    @FindBy (xpath = "html/body//select[contains(@id,'paymentInternetBanking')]/option" ) //Pembayaran lainnya
    private WebElementFacade buttonBayarKlikpay ;

    @FindBy (xpath = "html/body/ng-view/section[1]/div[1]/div[3]/form/div[6]/button" )
    private WebElementFacade buttonBayarSekarang;

//    @FindBy (xpath = "html/body/div[7]/div/div/div/div/div/div/div[2]/div/button")
//    private WebElementFacade buttonFB ;

    public void clickButtonIsiPulsa() {buttonIsiPulsa.click();}
    public void clickCobaSekarang() {buttonCobaSekarang.click();}
    public void clickPulsa() {buttonPulsa.click();}
    public void masukkanNoHp(String nomor) {
        fieldNoHP.type(nomor);
    }
    public void clickButtonUbahNominal() {buttonUbahNominal.click();}

    public void clickNominal(String nominal) {
        WebElementFacade nom = find(By.xpath("html/body//span[contains(text(),'"+nominal+"')]"));
        nom.click();
    }

    public void clickUbahPembayaran() {buttonUbahPembayaran.click();}
    public void clickPembayaranLainnya() {buttonBayarLainnya.click(); }
    public void clickBCAKlikPay() {buttonBayarKlikpay.click();}
//    public void clickBayarSekarang() {buttonBayarSekarang.click();}
//    public void clickButtonFB() {buttonFB.click();}



//    public void clickButtonLogin(){
//        buttonlogin.click();
//    }
//    public void clickFacebookButtonLogin() {buttonFacebook.click(); }

//    public boolean checkFormLoginIsAppear(){
//       try {
//           setWaitForTimeout(10000);
//           waitFor(ExpectedConditions.presenceOfElementLocated(By.xpath("html/body//div[@id='gdn-login-modal-body']")));
//           return true;
//       }catch (Exception e){
//           e.printStackTrace();
//           return false;
//       }
//    }



}
