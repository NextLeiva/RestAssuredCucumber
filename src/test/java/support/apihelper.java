package support;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class apihelper {

    //metodo es parametrizado
    public Response get(String url) {
        //vamos crear una varible de tipo response y llamar la peticion
        Response response = given().get(url);
        //Response response1 = given().baseUri(url).get(); //opcion alternativa
        return response;//retorna un valor
    }

//    public Response getEmployee(String url){
//        Response response = given().get(url);
//        return response;
//    }

}
