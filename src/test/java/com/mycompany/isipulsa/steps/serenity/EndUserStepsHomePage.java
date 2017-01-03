package com.mycompany.isipulsa.steps.serenity;

import com.mycompany.isipulsa.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.xpath.operations.Number;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;


/**
 * Created by Fransiskus A K on 27/12/2016.
 */
public class EndUserStepsHomePage extends ScenarioSteps {

    HomePage homePage;

    @Step
    public void openHomepageBlibli(){
        homePage.open();
    }

    @Step
    public void clickButtonIsiPulsa(){
        homePage.clickButtonIsiPulsa(); }
    @Step
    public void clickCobaSekarang() {homePage.clickCobaSekarang();}

    @Step
    public void clickPulsa() {homePage.clickPulsa();}

    @Step
    public void masukkanNoHp(String nomor) {homePage.masukkanNoHp(nomor);}

    @Step
    public void clickButtonUbahNominal() {homePage.clickButtonUbahNominal();}

    @Step
    public void clickNominal(String nominal) {homePage.clickNominal(nominal);}

    @Step
    public void clickUbahPembayaran() {homePage.clickUbahPembayaran();}

    @Step
    public void clickPembayaranLainnya() {homePage.clickPembayaranLainnya();}

    @Step
    public void clickBCAKlikPay() {homePage.clickBCAKlikPay();}

//    @Step
//    public void clickBayarSekarang() {homePage.clickBayarSekarang();}

//    @Step
//    public void clickButtonFB() {homePage.clickButtonFB();}
//
    @Step
    public void munculHalamanPembayaran() {}

//    @Step
//    public void checkPopUpLoginAppearOrNot(){
//        boolean result = homePage.checkFormLoginIsAppear();
//        assertThat("Pop Up Login Form tidak muncul",result);
//    }
}
