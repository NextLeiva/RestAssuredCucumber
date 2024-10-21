package support;

import io.restassured.response.Response;

public class requestEmployee {
    apihelper api;
    public static Response responseEmployee;

    public requestEmployee() {
        api = new apihelper();
    }

//    public void getEmployee() {
//        String url="https://dummy.restapiexample.com/api/v1/employees";
//        responseEmployee = api.getEmployee(url);
//    }
}
