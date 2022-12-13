package org.example;

import java.io.File;
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

    private void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Для продукта " + this.name + " вы ввели недопустимое значение цены");
            this.price = 0;
        }
        this.price = price;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getIdProduct() {
        return idProduct;
    }

    private void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    @Override
    public String toString() {
        return String.format("в магазине числится под номером: %d товар: %s со стоимостью: %f"
                , getIdProduct(), getName(), getPrice());
    }



public  List<Product> findName(String name, List<Product> products) {
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


    }



