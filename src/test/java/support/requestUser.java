package support;

import io.restassured.response.Response;

public class requestUser {
    //crear un variable asociada a pihelper
    apihelper api;
    public static Response responseuser;

    //constructor
    public requestUser() {
        //inicializar la variable
        api = new apihelper();
    }
    //metodo que va llamar
    public void getUsers(){
        String url="https://reqres.in/api/users/";
        //llamar dentro de la variable publica para utilziarlo
        responseuser = api.get(url);
    }





}
