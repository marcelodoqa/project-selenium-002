package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import pages.ContaPage;
import runner.Runner;

public class ContaSteps extends Runner {
    ContaPage contapage = new ContaPage(driver);

    @Dado("^que estou na pagina de contas$")
    public void queEstouNaPaginaDeContas() {
        contapage.login();
        contapage.esperarElementoAparecer(By.cssSelector("[data-test='menu-settings']"), 3);
        contapage.paginaConta();
    }

    @Quando("^insiro uma nova conta no campo vazio$")
    public void insiroUmaNovaContaNoCampoVazio() {
        contapage.fillAccount("New account CT002.1");
    }

    @E("^clico em salvar$")
    public void clicoEmSalvar() {
        contapage.clickBtnAccount();
    }

    @Então("^devo ver a nova conta na lista de contas$")
    public void devoVerANovaContaNaListaDeContas() {
        contapage.checkAccount("New account CT002.1");
    }

    @E("^receber um aviso de conta criada com sucesso$")
    public void receberUmAvisoDeContaCriadaComSucesso() {
        contapage.avisoMessage("Conta inserida com sucecsso!");
    }
}
