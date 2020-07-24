package com.buseduc.javacourse.oop2020.topic_003.task_18_pr;



public class Tocki {

    private double x;
    private  double y;
    private  double z;





    public Tocki( double x, double y, double z)
    {
        this.x= x ;
        this.y= y ;
        this.z= z ;

    }

    public Tocki(Tocki tocka) {
        this.x= tocka.x ;
        this.y= tocka.y ;
        this.z= tocka.z ;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

}


