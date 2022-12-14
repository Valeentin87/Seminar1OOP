package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MedicineProduct extends Product {
    private boolean narcoticSign;

    public MedicineProduct(double price, String name, int idProduct, boolean narcoticSign) {
        super(price, name, idProduct);
        this.narcoticSign = narcoticSign;
    }

    public MedicineProduct() {
        super();
    }


    public String isNarcoticSign() {
        if (this.narcoticSign==true)         return "отпускается по рецепту";
        else return "отпускается без рецепта";
    }

    public void setNarcoticSign(boolean narcoticSign) {
        this.narcoticSign = narcoticSign;
    }

    @Override
    public String toString() {
        return super.toString()+" "+isNarcoticSign();
    }

    public void addConsoleMedProduct() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите id лекарства: ");
            int idProduct = Integer.parseInt(br.readLine());
            setIdProduct(idProduct);

            System.out.print("Введите цену лекарства: ");
            double price = Double.parseDouble(br.readLine());
            setPrice(price);

            System.out.print("Введите название лекарства: ");
            String name = br.readLine();
            setName(name);

            System.out.println("Введите 'true' если наркотическое или 'false' если нет: ");
            boolean narcSign = Boolean.parseBoolean(br.readLine());
            setNarcoticSign(narcSign);

    }
}

