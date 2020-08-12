package com.buseduc.javacourse.oop2020.topic_08_pr.Task_09_pr;

public class Case extends Furniture{

    public double height;
    public double width;
    public double depth;

    public Case(String manufacturer,  String material, double price,  double height, double width, double depth) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.material = material;

        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    //   public Case() {}

    public Case (Case case1) {
        this.manufacturer=case1.manufacturer;

        this.material=case1.material;
        this.price=case1.price;
        this.height=case1.height;
        this.width=case1.width;
        this.depth=case1.depth;
    }

    ///////////////////////////////////////////////////////

    @Override
    public void putBook() {
        System.out.println(" The book is placed on the shelf ");
    };

    @Override
    public void takeBook() {System.out.println(" The book is taken from the shelf");
    };

    /////////////////////////////////

    public double getHeight() {
        return height;}

    public double getWidth() {
        return width;}

    public double getDepth() {
        return depth;}

    ////////////////////////////////////////////////////////////////7

    public void setHeight(double height) {
        this.height = height;}

    public void setWidth(double width) {
        this.width = width;}

    public void setDepth(double depth) {
        this.depth = depth;}

    ///////////////////////////////////////////////
    public String toString()
    {
        return " Manufacturer: "+getManufacturer()+"; Material: "+ getMaterial()+"; Price: "+getPrice()+"; Height: "+getHeight()+"; Width: "+getWidth()+"; Depth: "+getDepth()+" \n ";
    }

}
