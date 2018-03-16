package com.sarunas.sliogeris.overview;

import java.util.ArrayList;
import java.util.List;

public class ListoSplit {

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



        irasuKolekcija.forEach(System.out ::println);

        System.out.println();

        List<String> pirma = irasuKolekcija.subList(0, irasuKolekcija.size() / 2);
        List<String> antra = irasuKolekcija.subList(5, 10);

        pirma.forEach(System.out ::println);

        System.out.println();

        antra.forEach(System.out ::println);

    }

}
