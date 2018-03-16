package com.sarunas.sliogeris.overview;

public class SubstringUzduotys {

    public static void main(String[] args) {

        String sakinys = "as niekad nemokejau abc abeceles";

        String naujasSakinys = sakinys.substring(3, sakinys.length());

        System.out.println(naujasSakinys);

        String pirmasSakinys = sakinys.substring(0, 14);
        String antrasSakinys = sakinys.substring(14, sakinys.length());

        System.out.println(pirmasSakinys);
        System.out.println(antrasSakinys);

        String sakinysKuriSplitinsim = "As nuoru but Java developeriu";

        String[] tarpoSplitas = sakinysKuriSplitinsim.split(" ");

        for (String splitas : tarpoSplitas) {
            System.out.println(splitas);
        }

    }

}
