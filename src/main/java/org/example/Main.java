package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        PartyProducts products = new PartyProducts();
        Product milk = new Product(23,"milk", 5647);
        System.out.println(milk);
        System.out.println(products);
        List<Product> newProducts = products.addProducts();
        FileWriter baseProducts = new FileWriter("baseproduct.txt",true);
        for (Product product:newProducts) {
            baseProducts.write(product.toString()+"\n");
        }
        baseProducts.close();
        newProducts.forEach(product -> System.out.println(product));

        Product alcoProduct = new AlcogolDrink(23.9,"beer",2348,1234959596,4.6);


        List<Product> allProduct = new ArrayList<>();
        allProduct.add(new AlcogolDrink(49.6,"vodka",49358,23457899,40));
        allProduct.add(new Product(25.7,"potato",435));
        allProduct.add(new Product(12.3,"water",3435));
        allProduct.add(alcoProduct);
        allProduct.add(new MedicineProduct(67.2,"Narco",38434,true));
        allProduct.forEach(i-> System.out.print(i+"\n"));
        allProduct.add(new MedicineProduct(61.1,"Streptocid",23848,false));

        MedicineProduct medic = new MedicineProduct();
        Product searchList = new Product();
        //System.out.println(searchList.findName("vodka",allProduct));
        System.out.println(searchList.findPrice(12,55.0,allProduct));

        PartyProducts november11 = new PartyProducts("Валентин", 6);
        System.out.println(november11);
    }
}