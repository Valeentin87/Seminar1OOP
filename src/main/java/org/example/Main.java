package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        FileWriter baseProducts = new FileWriter("baseproduct.txt",true);
        PartyProducts newProd = new PartyProducts();
        List<PartyProducts> newProductList = new ArrayList<>();
        newProductList.add(newProd.createPartyProd());
        for(Product i:newProd.getPartyProduct()) {
            System.out.println(i.toString()+"\n");
            baseProducts.write(i.toString()+"\n");
        }
        baseProducts.write(newProd.toString());
        System.out.println(newProd);


    }
}