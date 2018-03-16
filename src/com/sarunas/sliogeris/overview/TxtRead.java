package com.sarunas.sliogeris.overview;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TxtRead {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        try
            (BufferedReader skaitymas = new BufferedReader(new FileReader("vardai.txt"))) {
            String line;
            while ((line = skaitymas.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names);

    }

}
