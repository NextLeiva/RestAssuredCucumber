package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ResponseBody;
import org.junit.Assert;
import support.requestUser;

import java.util.List;

//conexion entrelegunaje gherkin con lenguaje java
public class servicioUsuarioDefinitions {
    requestUser user;

    //constructor
    public servicioUsuarioDefinitions() {
        user = new requestUser();
    }

    @Given("listar usuarios")
    public void listarUsuarios() {
        user.getUsers();
    }

    @When("mostrar el listado de usuarios")
    public void mostrarElListadoDeUsuarios() {
        ResponseBody body = requestUser.responseuser;
        System.out.println(body.asString());
    }

    @And("validar codigo de respuesta {string}")
    public void validarCodigoDeRespuesta(String codigo) {
        Assert.assertEquals(Integer.parseInt(codigo),requestUser.responseuser.getStatusCode());
    }

    @Then("validar numero de registros")
    public void validarNumeroDeRegistros() {
        ResponseBody body = requestUser.responseuser;
        JsonPath json = new JsonPath(body.asString());
        //lista el response de body
        List<String> listado = json.with(body.asString()).get("data");
        //va buscar el valor perpage
        int cantidad = json.getInt("per_page");
        Assert.assertEquals(cantidad,listado.size());
    }
}
