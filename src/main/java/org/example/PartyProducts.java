package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PartyProducts extends Product{
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

    public List<Product> getPartyProduct() {
        return partyProduct;
    }

    public void setComingDate(String comingDate) {
        this.comingDate = comingDate;
    }

    public void setPartyProduct(List<Product> partyProduct) {
        this.partyProduct = partyProduct;
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

    public List<Product> addProducts() throws IOException {
        List<Product> entranceProducts = new ArrayList<>();

        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int scanId = 0;
        System.out.print("Введите категорию товара,поступившего на склад: \n" +
                "1. Товары общего потребления \n" +
                "2. Товары,содержащие алкоголь \n" +
                "3. Лекарственные средства \n" +
                "Ваш товар относится к категории №:\n ");
        int sc = Integer.parseInt(scanner.readLine());
        double scanPrice = 0;
        String scanName = null;
        while (sc!=0) {

            switch (sc){
                case 1:
                    Product addProduct = new Product();
                    addProduct.addConsoleProduct();
                    entranceProducts.add(addProduct);
                    break;

                case 2:
                    AlcogolDrink addAlcoProduct = new AlcogolDrink();
                    addAlcoProduct.addConsoleAlcProduct();
                    entranceProducts.add(addAlcoProduct);
                    break;

                case 3:
                    MedicineProduct addMedicineProduct = new MedicineProduct();
                    addMedicineProduct.addConsoleMedProduct();
                    entranceProducts.add(addMedicineProduct);
                    break;

                case 0:
                    System.out.println("Приём товара завершён");
                    break;

                default:
                    System.out.println("произошла ошибка выбора категории");
                    break;


            }
            System.out.print("Введите категорию товара,поступившего на склад: \n" +
                    "1. Товары общего потребления \n" +
                    "2. Товары,содержащие алкоголь \n" +
                    "3. Лекарственные средства \n" +
                    "0. Завершить приём товара \n"+
                    "Ваш товар относится к категории №:\n ");
            sc = Integer.parseInt(scanner.readLine());

        }
        return entranceProducts;
    }
    PartyProducts createPartyProd() throws IOException {
        PartyProducts partyProducts = new PartyProducts();
        setPartyProduct(partyProducts.addProducts());
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("введите имя менеджера, принимающего товар: ");
            String nameManager = br.readLine();
            setNameManager(nameManager);

            System.out.println("Введите дату поступления товара");
            String date = br.readLine();
            setComingDate(date);


            System.out.println("Ввведите номер склада, на который отгружен товар");
            int sklad = Integer.parseInt(br.readLine());
            setNumberWarehouse(sklad);

        return partyProducts;
    }
}
