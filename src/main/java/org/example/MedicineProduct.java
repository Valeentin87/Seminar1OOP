package org.example;

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

    @Override
    public String toString() {
        return super.toString()+" "+isNarcoticSign();
    }
}

