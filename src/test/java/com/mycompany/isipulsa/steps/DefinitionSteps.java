package com.mycompany.isipulsa.steps;

import com.mycompany.isipulsa.steps.serenity.EndUserStepsHomePage;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class DefinitionSteps {

/*    Given the user is on homepage blibli.com
When the user click button login
When the user click facebook button login
Then login session should be entered*/


    @Steps
    EndUserStepsHomePage endUserStepsHomePage;

    @Given("the user is on homepage blibli.com")
    public void theUserIsOnHomepageBlibli() {
        endUserStepsHomePage.openHomepageBlibli();
    }

    @When("the user click button Isi pulsa")
    public void theUserClickButtonIsiPulsa() {
        endUserStepsHomePage.clickButtonIsiPulsa();
    }

    @When("the user click coba sekarang")
    public void theUserClickCobaSekarang() {endUserStepsHomePage.clickCobaSekarang(); }

    @When("the user click pulsa")
    public void theUserClickPulsa() {endUserStepsHomePage.clickPulsa(); }

    @When("the user type no HP '$nomor'")
    public void theUserTypeNoHp(String nomor) {endUserStepsHomePage.masukkanNoHp(nomor); }

    @When("the user click ubah Nominal")
    public void theUserClickUbahNominal() {endUserStepsHomePage.clickButtonUbahNominal();}

    @When("the user click Nominal '$nominal'")
    public void theUserClickNominal(String nominal) {endUserStepsHomePage.clickNominal(nominal);}

    @When("the user click Ubah Pembayaran")
    public void theUserClickUbahPembayaran() {endUserStepsHomePage.clickUbahPembayaran(); }

    @When("the user click pembayaran lainnya")
    public void theUserClickPembayaranLainnya() {endUserStepsHomePage.clickPembayaranLainnya(); }

    @When("the user click BCA Klikpay")
    public void theUserClickBCAKlikpay() {endUserStepsHomePage.clickBCAKlikPay(); }

//    @When("the user click bayar sekarang")
//    public void theUserClickBayarSekarang() {endUserStepsHomePage.clickBayarSekarang(); }

//    @When("the user click facebook")
//    public void theUserClickFacebook() {endUserStepsHomePage.clickButtonFB();}
//
    @Then("Click Bayar Sekarang To Continue")
    public void munculHalamanPembayaran() {}

//
//    @When("the user click facebook button login")
//    public void theUserClickButtonFacebookLogin() {
//        endUserStepsHomePage.clickFacebookButtonLogin();
//    }
//    @When("the user is on homepage blibli.com")
//    public void theUserIsOnHomepageBlibliAgain() {
//        endUserStepsHomePage.openHomepageBlibliAgain();
//    }
//
//    @Then("login session should be entered")
//    public void theUserLoggedIn() {}

//    public void PopUpLoginShouldBeAppear(){
//        endUserStepsHomePage.checkPopUpLoginAppearOrNot();
//    }

}