package com.buseduc.javacourse.oop2020.topic_08_pr.Task_09_pr;

public abstract class Furniture implements Bookcase {

    public String manufacturer;
    public String material;
    public double price;

    public Furniture(String manufacturer,  String material, double price) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;
    }

    public Furniture() {}

    ////////////////////////////////////////////////////
    public String getManufacturer() {
        return manufacturer;}

    public String getMaterial() {
        return material;}

    public double getPrice() {
        return price;}
    ////////////////////////////////////////////////////

    @Override
    public void putBook() {};

    @Override
    public void takeBook() {};

    ////////////////////////////////////////////////////////////////7

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;}

    public void setMaterial(String material) {
        this.material = material;}

    public void setPrice(double price) {
        this.price = price;}

}
