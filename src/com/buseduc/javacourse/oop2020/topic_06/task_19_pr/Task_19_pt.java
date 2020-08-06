package com.buseduc.javacourse.oop2020.topic_06.task_19_pr;
import java.util.ArrayList;
public class Task_19_pt {
    public static void main(String[] args) {

        Pastila pastila1 = new Pastila("Pastila white", 0.55, 142, 30, 0.33, "White");
        pastila1.setName("Pastila white");
        pastila1.setColor("White");
        pastila1.setPrice(5.1);
        pastila1.setEncost(40);
        pastila1.setWeight(5);
        pastila1.setSugar(2);

        Konf[] konfety;
        konfety = new Konf[5];

        konfety[0] = new Konf("Konf0", "Shokoladnaya", 5.0, 40, 5, 2);
        konfety[0].setName("Konf0");
        konfety[0].setType("Shokoladnaya");
        konfety[0].setPrice(5.1);
        konfety[0].setEncost(40);
        konfety[0].setWeight(5);
        konfety[0].setSugar(2);

        konfety[1] = new Konf("Konf1", "Shokoladnaya", 5.0, 35, 4, 1.5);
        konfety[1].setName("Konf1");
        konfety[1].setType("Shokoladnaya");
        konfety[1].setPrice(5.1);
        konfety[1].setEncost(35);
        konfety[1].setWeight(4);
        konfety[1].setSugar(1.5);

        konfety[2] = new Konf("Konf2", "Shokoladnaya", 4.0, 40, 3.5, 1);
        konfety[2].setName("Konf2");
        konfety[2].setType("Shokoladnaya");
        konfety[2].setPrice(4.0);
        konfety[2].setEncost(40);
        konfety[2].setWeight(3.5);
        konfety[2].setSugar(1);

        konfety[3] = new Konf("Konf3", "Karamelle", 2.0, 38, 2.2, 3);
        konfety[3].setName("Konf3");
        konfety[3].setType("Karamelle");
        konfety[3].setPrice(2.0);
        konfety[3].setEncost(38);
        konfety[3].setWeight(2.2);
        konfety[3].setSugar(3);

        konfety[4] = new Konf("Konf4", "Karamelle", 1.5, 28, 1.3, 4);
        konfety[4].setName("Konf4");
        konfety[4].setType("Karamelle");
        konfety[4].setPrice(1.5);
        konfety[4].setEncost(28);
        konfety[4].setWeight(1.3);
        konfety[4].setSugar(4);

        ArrayList<Slad> gift = new ArrayList<Slad>();
        System.out.println("Gift");

        int npast = 3;

        for (int j = 0; j < npast; j++) {
            gift.add(pastila1);
        }
        int ni = 0;

        for (int i = 0; i < 5; i++) {
            ni = (int) (Math.random() * 5) + 1;
            for (int j = 0; j < ni; j++) {
                {
                    gift.add(konfety[i]);
                }
            }
        }

        System.out.println(gift);

        Slad[] array = new Slad[gift.size()];
        gift.toArray(array);

        Konf tmp;

      //  for (int i = 0; i < gift.size(); i++) {

        //    if (array[i] instanceof Konf) {
          //      System.out.println(array[i]);
            //}
        //}
        ////////////////////////////////////////////////////////////////////

        for (int i = 0; i < gift.size(); i++) {

            // if (array[i] instanceof Pastila) {break;}

            for (int j = i + 1; j < gift.size(); j++) {

                if ((array[j] instanceof Konf) & (array[i] instanceof Konf)) {
                    if (array[j].getSugar() < array[i].getSugar()) {
                        tmp = (Konf) array[i];
                        array[i] = array[j];
                        array[j] = tmp;
                    }
                }

            }

        }

        System.out.println("After sorting of candies with respect to sugar content(not Pastila):");

        //////////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < gift.size(); i++) {

            {
                System.out.println(array[i]);
            }
        }

        System.out.println("Candies with sugar content<3 :");

        for (int i = 0; i < gift.size(); i++) {

            if ((array[i].getSugar() < 3) & (array[i] instanceof Konf)) {
                System.out.println(array[i]);
            }
        }

    }
}