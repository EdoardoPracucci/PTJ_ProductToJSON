import Controller.ClassToTestController;
import Controller.JsonController;

import Model.ClassToTest;
import Model.Product;
import View.InputValue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to PTJ convert your product in Json file");
        Product product = new Product();
        InputValue inputValue = new InputValue();
        JsonController jsonController = new JsonController();

        ClassToTest classToTest = new ClassToTest(1,2,"Ciao","Carlo");
        ClassToTestController classToTestController = new ClassToTestController();

        inputValue.inputProductValue(product);
        jsonController.productToJson(product);

        classToTestController.allString(classToTest.getC(),classToTest.getD());
        classToTestController.sum(classToTest.getA(),classToTest.getB());
        classToTestController.minus(classToTest.getA(),classToTest.getB());


    }


}