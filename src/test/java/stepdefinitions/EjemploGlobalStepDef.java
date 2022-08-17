package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;

import java.util.List;

public class EjemploGlobalStepDef {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Gherard");
    private HomePage homePage = new HomePage();

    @Dado("^que un nuevo cliente accede hasta la web de compras$")
    public void queUnNuevoClienteAccedeHastaLaWebDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePage));
    }

    @Cuando("^el agrega un producto al carro$")
    public void elAgregaUnProductosAlCarro() {

    }

    @Entonces("^el ve los productos listado en el carro de compras$")
    public void elVeLosProductosListadoEnElCarroDeCompras() {

    }

    @Cuando("^el agrega productos al carro$")
    public void elAgregaProductosAlCarro(List <String> datos) {

    }

}
