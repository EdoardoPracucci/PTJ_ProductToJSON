package Test;

import Controller.JsonController;
import Model.Product;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.Test;

class JsonControllerTest {

    @Test
    void productToJson() {
        Product productTest = new Product(1,"prova","provaCompany",10.00);
        JsonController jsonController = new JsonController();
        JSONObject jsonObject = new JSONObject();

        jsonController.productToJson(productTest);
//
//        jsonObject.put("id",productTest.getId());
//        jsonObject.put("name",productTest.getName());
//        jsonObject.put("company_name",productTest.getCompanyName());
//        jsonObject.put("price",productTest.getPrice());
//
//        assertEquals(jsonObject.get("id"),productTest.getId());
//        assertEquals(jsonObject.get("name"),productTest.getName());
//        assertEquals(jsonObject.get("company_name"),productTest.getCompanyName());
//        assertEquals(jsonObject.get("price"),productTest.getPrice());

    }
}