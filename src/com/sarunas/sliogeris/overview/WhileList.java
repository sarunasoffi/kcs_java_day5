package com.sarunas.sliogeris.overview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WhileList {

    public static void main(String[] args) {

        List<String> irasuKolekcija = new ArrayList<>();

        irasuKolekcija.add("Niekada");
        irasuKolekcija.add("Nebuciau");
        irasuKolekcija.add("Pagalvojes");
        irasuKolekcija.add("Kad");
        irasuKolekcija.add("Sutiksiu");
        irasuKolekcija.add("Andriu");
        irasuKolekcija.add("Rimiski");
        irasuKolekcija.add("Programavimo");
        irasuKolekcija.add("Kursuose");
        irasuKolekcija.add("Tikrai");

        System.out.println(irasuKolekcija);

        Iterator<String> iterator = irasuKolekcija.iterator();

        int i = 1;

        while (iterator.hasNext()) {
            iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            }
            i++;
        }
        System.out.println(irasuKolekcija);
//        int i = 0;
//        int didinti = 2;
//
//        while (i < irasuKolekcija.size()) {
//            irasuKolekcija.remove(didinti);
//            didinti = didinti + 2;
//            i = i + 2;
//            System.out.println(irasuKolekcija);
//        }

    }

}
