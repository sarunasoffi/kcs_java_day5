package com.sarunas.sliogeris.overview;

public class StrinFindTextInside {

    public static void main(String[] args) {

        String a = "as niekada test niekur nenaudojau";
        String b = "test";

        if (a.contains(b)) {
            System.out.println("Stringe rado zodi - " + b);
        } else {
            System.out.println("Nerado zodzio");
        }

        a.matches(".*\\test\\b.*");

        String sakinys = "As moku abc, gal ir tu moki abc";
        String zodis = "abc";
        String pakeitimasZodzio = "def";
        System.out.println(sakinys);

        if (sakinys.contains(zodis)) {
            String naujasSakinys = sakinys.replaceAll(zodis, pakeitimasZodzio);
            System.out.println(naujasSakinys);
        } else {
            System.out.println("Nieko nepakeite");
        }

    }
}
