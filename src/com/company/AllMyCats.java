package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllMyCats {
    private static AllMyCats allMyCats = null;
    //private final Map<String, String> listMyCats = new HashMap<>();
    private List<Object> listMyCats = new ArrayList<>();

    private AllMyCats() {
        //any initialization code
        //listMyCats = new HashMap<>();
    }

    public static AllMyCats createCatPride() {
        if (allMyCats == null) allMyCats = new AllMyCats();
        return allMyCats;
    }

    public void setCat(Object o) {
        //listMyCats.put(o, );
    }

    public void setKitty(String nameKitty, String colorKitty) {
        //MyCat kitty = MyCat.createNewCat(nameKitty, colorKitty);
        MyCat kitty = new MyCat(nameKitty, colorKitty);
    }


}
