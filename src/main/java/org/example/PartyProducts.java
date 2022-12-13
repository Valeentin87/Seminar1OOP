package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyProducts{
    List<Product> partyProduct = new ArrayList<>();
    String comingDate;
    String nameManager;
    Integer numberWarehouse;

    public PartyProducts(String nameManager, Integer numberWarehouse) {
        super();
        this.nameManager = nameManager;
        this.numberWarehouse = numberWarehouse;
    }

    public PartyProducts() {
        super();
    }

    public String getComingDate() {
        return comingDate;
    }

    public void setComingDate(String comingDate) {
        this.comingDate = comingDate;
    }

    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
    }

    public Integer getNumberWarehouse() {
        return numberWarehouse;
    }

    public void setNumberWarehouse(Integer numberWarehouse) {
        this.numberWarehouse = numberWarehouse;
    }

    @Override
    public String toString() {
        return "Указанную партию товара принимал менеджер: "+getNameManager()+ " "+
                getComingDate()+" на складе № "+getNumberWarehouse();
    }

    public List<Product> addProducts() {
        List<Product> entranceProducts = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Scanner scan1 = new Scanner(System.in);
        int scanner = 1;
        int scanId = 0;
        double scanPrice = 0;
        String scanName = null;
        while (true) {
            System.out.print("Если хотите добавить новый товар нажмите 1 если нет нажмите 0 ");
            if (scan.hasNext()) {
                scanner = scan.nextInt();
            } else {
                System.out.println("вы ввели значение, отличное от 0 или 1, перезапустите программу");
            }
            if (scanner == 0) break;
            System.out.print("введите наименованаие поступившего товара ");
            if (scan1.hasNextLine()) {
                scanName = scan1.nextLine();
            } else System.out.println("Некорректные данные для наименования товара");

            System.out.print("введите Id поступившего товара ");
            if (scan.hasNext()) {
                scanId = scan.nextInt();
            } else System.out.println("Некорректные данные для id товара");
            System.out.print("введите цену поступившего товара ");
            if (scan.hasNextDouble()) {
                scanPrice = scan.nextDouble();
            } else System.out.println("Некорректные данные для цены товара ");
            entranceProducts.add(new Product(scanPrice, scanName, scanId));
        }
        System.out.println("Вы завершили вносить данные по поступившему товару!");


        return entranceProducts;
    }
}
