package com.sarunas.sliogeris.overview;

import java.util.LinkedList;

public class MethodList {

    public static void main(String[] args) {

        LinkedList<String> name = createNewList();
        name.forEach(System.out ::println);
        System.out.println("-------papildytas-------");

        name.addFirst("Maryte");
        name.addLast("Jonukas");

        name.forEach(System.out ::println);
    }

    private static LinkedList<String> createNewList() {
        LinkedList<String> names = new LinkedList<>();

        names.add("Jonce");
        names.add("Antoske");
        names.add("Jokubas");
        names.add("Kestis");
        names.add("Juozapota");

        return names;
    }

}
