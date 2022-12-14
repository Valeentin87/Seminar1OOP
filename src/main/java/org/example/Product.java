package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private double price;
    private String name;
    private int idProduct;

    public Product() {
        super();
    }

    public Product(double price, String name, int idProduct) {
        this.price = price;
        this.name = name;
        this.idProduct = idProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {

        return "Товар "+ getName()+ " c id  "+getIdProduct()+ " стоит "+getPrice();
    }

    public  List<Product> findName(String name, List<PartyProducts> products) {
    List<Product> nameSearchList = new ArrayList<>();
    for (Product element:products) {
        if(element.getName().equals(name)) nameSearchList.add(element);
    }
    return nameSearchList;
}


    public  List<Product> findPrice(double priceMin, double priceMax, List<Product> products) {
        List<Product> nameSearchList = new ArrayList<>();
        for (Product element:products) {
            if(element.getPrice()>=priceMin & element.getPrice()<=priceMax)  nameSearchList.add(element);
        }
        return nameSearchList;
    }

    public void addConsoleProduct() throws IOException {
        Product addProd = new Product();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Введите id продукта: ");
            int idProduct = Integer.parseInt(br.readLine());
            setIdProduct(idProduct);

            System.out.print("Введите цену продукта: ");
            double price = Double.parseDouble(br.readLine());
            setPrice(price);

            System.out.print("Введите наименование продукта: ");
            String name = br.readLine();
            setName(name);


            }
    }



