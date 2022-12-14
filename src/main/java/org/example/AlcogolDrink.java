package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AlcogolDrink extends Product {
    private int exciseStamp;
    private double gradus;




    public AlcogolDrink(double price, String name, int idProduct,int exciseStamp, double gradus) {
        super(price, name, idProduct);
        this.exciseStamp = exciseStamp;
        this.gradus = gradus;
    }

    public AlcogolDrink() {
        super();
    }

    @Override
    public String toString() {
        return super.toString()+" акцизная марка: "+getExciseStamp()+" градус алкоголя: "+getGradus();
    }

    public int getExciseStamp() {
        return exciseStamp;
    }

    public void setExciseStamp(int exciseStamp) {
        this.exciseStamp = exciseStamp;
    }

    public double getGradus() {
        return gradus;
    }

    public void setGradus(double gradus) {
        this.gradus = gradus;
    }

    public void addConsoleAlcProduct() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("введите id продукта: ");
            int idProduct = Integer.parseInt(br.readLine());
            setIdProduct(idProduct);

            System.out.print("Введите цену продукта: ");
            double price = Double.parseDouble(br.readLine());
            setPrice(price);

            System.out.println("Введите наименование продукта: ");
            String name = br.readLine();
            setName(name);

            System.out.print("Введите процент содержания алкоголя");
            double gradus = Double.parseDouble(br.readLine());
            setGradus(gradus);

            System.out.print("Введите акцизную марку: ");
            int num = Integer.parseInt(br.readLine());
            setExciseStamp(num);


    }
}
