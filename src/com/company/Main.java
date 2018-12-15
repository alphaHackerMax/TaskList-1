package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        List cat2generation = new ArrayList();
        MyCat cat1 = new MyCat("Busa", "white", cat2generation);
        System.out.printf("cat1 name %s", cat1.getCatName());
        System.out.printf(" cat1 birth date %s", cat1.getCatBirthDate());
        System.out.printf(" cat1 color %s", cat1.getCatColor());
        System.out.printf(" hashCode %s", cat1.hashCode());
        System.out.printf(" Object %s\n", cat1);

        MyCat cat2 = new MyCat("Pusa", "blue");
        System.out.printf("cat2 name %s", cat2.getCatName());
        System.out.printf(" cat2 birth date %s", cat2.getCatBirthDate());
        System.out.printf(" cat2 color %s", cat2.getCatColor());
        System.out.printf(" hashCode %s", cat2.hashCode());
        System.out.printf(" Object %s\n", cat2);

        cat2 = new MyCat("Musa", "black");
        System.out.printf("cat2 name %s", cat2.getCatName());
        System.out.printf(" cat2 birth date %s", cat2.getCatBirthDate());
        System.out.printf(" cat2 color %s", cat2.getCatColor());
        System.out.printf(" hashCode %s", cat2.hashCode());
        System.out.printf(" Object %s -attempt to change or create new object\n", cat2);

        MyCat cat3 = new MyCat("Kusa", "green", "05-12-2018");
        System.out.printf("cat3 name %s", cat3.getCatName());
        System.out.printf(" cat3 birth date %s", cat3.getCatBirthDate());
        System.out.printf(" cat3 color %s", cat3.getCatColor());
        System.out.printf(" hashCode %s", cat3.hashCode());
        System.out.printf(" Object %s\n", cat3);

        MyCat cat31 = new MyCat("Kusa", "green", "05-12-2018");
        System.out.printf("cat31 name %s", cat31.getCatName());
        System.out.printf(" cat31 birth date %s", cat31.getCatBirthDate());
        System.out.printf(" cat31 color %s", cat31.getCatColor());
        System.out.printf(" hashCode %s", cat31.hashCode());
        System.out.printf(" Object %s\n", cat31);

        cat31 = new MyCat("Fusa", "yellow", "01-12-2017");
        System.out.printf("cat31 name %s", cat31.getCatName());
        System.out.printf(" cat31 birth date %s", cat31.getCatBirthDate());
        System.out.printf(" cat31 color %s", cat31.getCatColor());
        System.out.printf(" hashCode %s", cat31.hashCode());
        System.out.printf(" Object %s\n", cat31);

        testCatModification(cat3.getCatName());
        System.out.printf("cat3 name %s", cat3.getCatName());
        System.out.printf(" cat3 birth date %s", cat3.getCatBirthDate());
        System.out.printf("   \t\t\t\thashCode %s", cat3.hashCode());
        System.out.printf(" Object %s -attempt to change object field\n", cat3);

        List listKitty = new ArrayList();
        listKitty.add(cat1);
        listKitty.add(cat2);
        listKitty.add(cat3);
        MyCat cat4 = new MyCat("Dusa", "red", listKitty, "01.04.2015");
        System.out.printf("cat4 name %s", cat4.getCatName());
        System.out.printf(" cat4 birth date %s", cat4.getCatBirthDate());
        System.out.printf(" cat4 color %s", cat4.getCatColor());
        System.out.printf(" hashCode %s", cat4.hashCode());
        System.out.printf(" Object %s\n", cat4);
        System.out.println(cat4.getListKitty());
        MyCat w0 = (MyCat) cat4.getListKitty().get(0);
        MyCat w1 = (MyCat) cat4.getListKitty().get(1);
        MyCat w2 = (MyCat) cat4.getListKitty().get(2);
        //w2 = (MyCat) cat4.getListKitty().remove(2);  // will throw exception
        System.out.println(w0.getCatName() + " " + w0.getCatBirthDate() + " " + w0.getCatColor() + " " + w0.hashCode() + " " + w0);
        System.out.println(w1.getCatName() + " " + w1.getCatBirthDate() + " " + w1.getCatColor() + " " + w1.hashCode() + " " + w1);
        System.out.println(w2.getCatName() + " " + w2.getCatBirthDate() + " " + w2.getCatColor() + " " + w2.hashCode() + " " + w2);
        try {
            w2 = (MyCat) cat4.getListKitty().remove(2);
        } catch (Exception ex) {
            System.out.println("[ ERROR ] Try removing cat3 in kitty list!");
            System.out.println("deleting is fails");
            System.out.println(cat4.getListKitty());
            System.out.println(w2.getCatName() + " " + w2.getCatBirthDate() + " " + w2.getCatColor());
        }
    }

    private static void testCatModification(String catName) {
        catName = "XXXX";
    }
}
