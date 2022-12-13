package org.example;

public class AlcogolDrink extends Product {
    private int exciseStamp;
    private double gradus;




    public AlcogolDrink(double price, String name, int idProduct,int exciseStamp, double gradus) {
        super(price, name, idProduct);
        this.exciseStamp = exciseStamp;
        this.gradus = gradus;
    }

    @Override
    public String toString() {
        return super.toString()+" акцизная марка: "+getExciseStamp()+" градус алкоголя: "+getGradus();
    }

    public int getExciseStamp() {
        return exciseStamp;
    }

    private void setExciseStamp(int exciseStamp) {
        this.exciseStamp = exciseStamp;
    }

    public double getGradus() {
        return gradus;
    }

    private void setGradus(double gradus) {
        this.gradus = gradus;
    }
}
