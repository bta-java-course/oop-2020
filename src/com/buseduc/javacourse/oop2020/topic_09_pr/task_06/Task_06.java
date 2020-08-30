package com.buseduc.javacourse.oop2020.topic_09_pr.task_06;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class Task_06 {

    public static void main(String[] args)	 {
        ArrayList<Integer> l1coinc = new ArrayList<Integer>();

        System.out.println("Two arrays to be considered.");
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        list1.add(6);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(6);
        int list1Size=list1.size();
        System.out.println(list1.toString());
        int sig=0;
        for(int i = 0; i < list1Size; i++) {
            sig=sig+list1.get(i)*list1.get(i);
        }
        //
        for(int i = list1Size-1; i >-1; i=i-1) {
            for(int j = 0; j < i; j++) {
                if(	 list1.get(j).equals(list1.get(i))) {list1.remove(j);
                    list1.add(j, sig);
                } }	 }

        for(int i = list1Size-1; i >-1; i=i-1) {
            if(	 list1.get(i).equals(sig)) {list1.remove(i);}
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);
        list2.add(2);
        list2.add(2);
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(7);
        list2.add(6);
        list2.add(67);

        int list2Size=list2.size();
        System.out.println(list2.toString());

        for(int i = 0; i < list2Size; i++) {
            sig=sig+list2.get(i)*list2.get(i);
        }
        //
        for(int i = list2Size-1; i >-1; i=i-1) {
            for(int j = 0; j < i; j++) {
                if(	 list2.get(j).equals(list2.get(i))) {list2.remove(j);
                    list2.add(j, sig);
                } }	 }

        for(int i = list2Size-1; i >-1; i=i-1) {
            if(	 list2.get(i).equals(sig)) {list2.remove(i);}
        }

        list1Size=list1.size();

        list2Size=list2.size();


        for(int i = 0; i < list1Size; i++) {

            for(int j = 0; j < list2Size; j++) {

                if(	 list2.get(j).equals(list1.get(i))) {

                    l1coinc.add(list2.get(j));
                }

            }

        }
///
        System.out.println("These integer numbers belong to both arrays:"+l1coinc.toString());
        //

        list1.addAll(list2);

        list1Size=list1.size();

        for(int i = 0; i < list1Size; i++) {
            sig=sig+list1.get(i)*list1.get(i);
        }

        int size=l1coinc.size();

        for(int i = size-1; i >-1; i=i-1) {
            for(int j = 0; j < list1Size; j++) {

                if(	 l1coinc.get(i)==list1.get(j)) {
//				System.out.println("jjjj");
                    list1.remove(j);
                    list1.add(j, sig);

                } }	 }

        for(int i = list1Size-1; i >-1; i=i-1) {
            if(	 list1.get(i).equals(sig)) {list1.remove(i);}
        }

        System.out.println("These integer numbers belong only to one of these arrays:"+list1.toString());

    }

}














