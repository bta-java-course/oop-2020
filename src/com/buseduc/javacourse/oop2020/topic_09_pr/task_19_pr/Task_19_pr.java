package com.buseduc.javacourse.oop2020.topic_09_pr.task_19_pr;

/**
 * Тема 9. pr
 * Задание 19. На прямой гоночной трассе стоит N автомобилей, для каждого из которых известны начальное положение и скорость. Определить, сколько произойдет обгонов.
 */


import java.util.ArrayList;


public class Task_19_pr {

    public static void main(String[] args)	 {

        ArrayList<Double> stKoord = new ArrayList<Double>();
        ArrayList<Double>  stVelo = new ArrayList<Double>();

        System.out.println( "Suppose that starting coordinates do not coincide and all cars move in the same direction.");

        double x0;
        double v0;

        int nCars=4;

        for(int j = 0; j < nCars; j++) {
            x0=(Math.random()+0.5)*20;
            v0=(Math.random()+0.5)*80.0;

            stKoord.add(x0);
            stVelo.add(v0);
        }
        System.out.println( "Starting coordinates:");
        System.out.println(stKoord);
        System.out.println( "Starting velocities:");
        System.out.println(stVelo);

        double t;
        int count=0;


        for(int j = 0; j < nCars; j++) {
            for(int i = 0; i < nCars; i++) {

                if (i != j) {t=(stKoord.get(i)-stKoord.get(j))/(stVelo.get(j)-stVelo.get(i));
                    if(t>0) {count=count+1;}



                }

            }
        }


        System.out.println( "Number of overtaking:"+count/2);

    }
}

