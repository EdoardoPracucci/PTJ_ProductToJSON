import Controller.ClassToTestController;
import Controller.JsonController;

import Model.ClassToTest;
import Model.Product;
import View.InputValue;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to PTJ convert your product in Json file");

        //Products initialization
        Product product = new Product();
        List<Product> products = new ArrayList<Product>();
        InputValue inputValue = new InputValue();
        JsonController jsonController = new JsonController();

        //method to insert product
        inputValue.inputProductValue(product);
        //method to convert the product to json
        jsonController.productToJson(product);

//this part of program is used for test and learn many method
        //class to try many method
        ClassToTest classToTest = new ClassToTest(1,2,"Ciao","Carlo");
        ClassToTestController classToTestController = new ClassToTestController();

        classToTestController.allString(classToTest.getC(),classToTest.getD());
        classToTestController.sum(classToTest.getA(),classToTest.getB());
        classToTestController.minus(classToTest.getA(),classToTest.getB());


    }


}