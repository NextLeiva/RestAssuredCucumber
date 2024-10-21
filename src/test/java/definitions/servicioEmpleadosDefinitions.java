package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.response.ResponseBody;
import support.requestEmployee;

public class servicioEmpleadosDefinitions {
    requestEmployee employee;

    public servicioEmpleadosDefinitions() {
        employee = new requestEmployee();
    }

    @Given("listar empleados")
    public void listarEmpleados() {
        //employee.getEmployee();

    }


    @When("mostrar el listado de empleados")
    public void mostrarElListadoDeEmpleados() {
        ResponseBody body=requestEmployee.responseEmployee;
        System.out.println(body.asString());
    }
}
