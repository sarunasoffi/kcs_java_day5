package com.sarunas.sliogeris.overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUzduotys {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Andrius");
        names.add("Jonas");
        names.add("Aloyzas");
        names.add("Petka");
        names.add("Antaniuks");

        //Collections.sort(names);

        for (String name : names) {
            if (name.length() >= 6) {
                System.out.println(name);
            } else {
                System.out.println(name + " - vardas per trumpas, pasikeisk");
            }
        }


        //tiktai nuo java 8

//        names.forEach(name -> {
//            if (name.length() >=6) {
//                System.out.println(name);
//            }
//        });

        System.out.println("Pirmas vardas yra " + getFirstElement(names));
        System.out.println("Paskutinis vardas yra " + getLastElement(names));

    }

    private static String getFirstElement(List<String> names) {

        String firstName = names.get(0);
        return firstName;

    }

    private static String getLastElement(List<String> names) {

        String lastName = names.get(names.size() - 1);
        return lastName;

    }

}
