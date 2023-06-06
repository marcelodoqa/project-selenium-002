package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import runner.Runner;

public class LoginSteps extends Runner {

    LoginPage loginpage = new LoginPage(driver);

    @Dado("^que estou na pagina de login$")
    public void que_estou_na_pagina_de_login() {

        loginpage.acessarSite();
    }

    @Quando("^insiro um email valido$")
    public void insiro_um_email_valido() throws Throwable {
        loginpage.fillEmail("marcelo@mail.com");
    }

    @Quando("^insiro uma senha valida$")
    public void insiro_uma_senha_valida() throws Throwable {
        loginpage.fillPaswd("senha123");
    }

    @Então("^devo redirecionado para a pagina inicial$")
    public void devo_redirecionado_para_a_pagina_inicial() throws Throwable {
        WebElement element = driver.findElement(By.id("navbarSupportedContent"));
        Assert.assertTrue(element.isDisplayed());
    }

    @Então("^receber um aviso de bem vindo$")
    public void receber_um_aviso_de_bem_vindo() throws Throwable {
        loginpage.avisoMessage("Bem vindo, ");
        loginpage.logout();
    }

    @E("^clico em entrar$")
    public void clicoEmEntrar() {
        loginpage.clickBtn();
    }

    @Quando("^insiro um email invalido$")
    public void insiroUmEmailInvalido() throws Throwable {
        loginpage.fillEmail("marcelo@mail");
    }

    @Então("^devo receber um aviso de Error$")
    public void devoReceberUmAvisoDeError() {
        loginpage.avisoMessage("Error");
    }

    @E("^insiro uma senha invalida$")
    public void insiroUmaSenhaInvalida() {
        loginpage.fillPaswd("senh323");
    }

    @Quando("^nao preencho nenhum campo$")
    public void naoPreenchoNenhumCampo() {
        driver.findElement(By.cssSelector("[data-test='email']")).clear();
    }

    @Então("^devo receber um aviso de Error2$")
    public void devoReceberUmAvisoDeError2() {
        loginpage.avisoMessage("!");
    }


}
