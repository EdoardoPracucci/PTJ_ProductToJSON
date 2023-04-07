package View;

import Model.Product;

import java.util.Scanner;

public class InputValue {
    Scanner sc = new Scanner(System.in);

    //change move to view
    public void inputProductValue(Product product){
        System.out.println("Insert Product ID:");
        product.setId(sc.nextInt());
        System.out.println("Insert Product Name:");
        sc.nextLine();
        product.setName(sc.nextLine());
        System.out.println("Insert Product Company Name:");
        product.setCompanyName(sc.nextLine());
        System.out.println("Insert Product Price:");
        product.setPrice(sc.nextDouble());
    }
}
