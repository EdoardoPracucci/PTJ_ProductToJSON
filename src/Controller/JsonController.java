package Controller;

import Model.Product;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class JsonController {
    public void productToJson(Product product){
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("product_id", product.getId());
        jsonObject.put("product_name", product.getName());
        jsonObject.put("product_company_Name", product.getCompanyName());
        jsonObject.put("product_price", product.getPrice());
        try {
            FileWriter file = new FileWriter("/home/edo/Documents/Repository/PTJ_ProductToJason/PTJ_ProductToJson/src/Json/product_info.json");
            file.write(jsonObject.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);
    }
}
