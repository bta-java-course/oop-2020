package com.buseduc.javacourse.oop2020.topic_003.task_18_pr;
/**
 * @author pr
 * Тема 3. ОСНОВЫ ООП
 * Задание 18. Определить класс Точка — Point3D (координаты x, y, z). Ввести 3 точки. Найти
 * расстояния между точками. Проверить, не находятся ли точки на одной
 * прямой.

 */
import java.util.Scanner;

public class Task_18_pr {


    public static void main(String[] args) {

        Tocki[] arr;
        arr = new Tocki[3];
        arr[1] = new Tocki(0,0,0);

        Scanner scan = new Scanner(System.in);

        //////////////////////////
        for(int i = 0; i < 3; i++) {
            arr[i] = new Tocki(0,0,0);
            System.out.println("Input X, "+ (i+1) +" Point ");

            try {

                arr[i].setX(scan.nextFloat());
                System.out.println("Input Y");
                arr[i].setY(scan.nextFloat());
                System.out.println("Input Z");
                arr[i].setZ(scan.nextFloat());

            } catch (Exception e) {System.out.println( " It is not a number." ); return;}

        }

        /////////////////////////
        for(int i = 0; i < 3; i++) {

            System.out.println("Point "+(i+1)+", x="+arr[i].getX()+",y="+arr[i].getY()+",z="+arr[i].getZ());
        }
        System.out.println("Distance between points 3 and 2 ");

        double d23=(arr[1].getX()-arr[2].getX())*(arr[1].getX()-arr[2].getX());
        d23=d23+(arr[1].getY()-arr[2].getY())*(arr[1].getY()-arr[2].getY());
        d23=d23+(arr[1].getZ()-arr[2].getZ())*(arr[1].getZ()-arr[2].getZ());
        d23= Math.sqrt(d23);
        System.out.println(d23);

        System.out.println("Distance between points 1 and 2 ");

        double d21=(arr[1].getX()-arr[0].getX())*(arr[1].getX()-arr[0].getX());
        d21=d21+(arr[1].getY()-arr[0].getY())*(arr[1].getY()-arr[0].getY());
        d21=d21+(arr[1].getZ()-arr[0].getZ())*(arr[1].getZ()-arr[0].getZ());
        d21= Math.sqrt(d21);
        System.out.println(d21);

        System.out.println("Distance between points 1 and 3 ");
        double d13=(arr[0].getX()-arr[2].getX())*(arr[0].getX()-arr[2].getX());
        d13=d13+(arr[0].getY()-arr[2].getY())*(arr[0].getY()-arr[2].getY());
        d13=d13+(arr[0].getZ()-arr[2].getZ())*(arr[0].getZ()-arr[2].getZ());
        d13= Math.sqrt(d13);
        System.out.println(d13);

        if (Math.abs((d21+d13)-(d23))<0.0000000000001) {System.out.println("Points lay on the same line "); return;}

        if (Math.abs(((d21+d23)-(d13)))<0.0000000000001) {System.out.println("Points lay on the same line "); return;}

        if (Math.abs(   ((d23+d13)-(d21)) )    <0.0000000000001) {System.out.println("Points lay on the same line ");}

    }
}
