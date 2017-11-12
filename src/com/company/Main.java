package com.company;

public class Main {

    public static void main(String[] args) {
        //OrderedPair kann mit jedem Parameter angelegt werden
        OrderedPair<String, String> p1 = new OrderedPair<String, String>("Airmax", "1000df382gS?8");
        OrderedPair<String, Integer> p2 = new OrderedPair<>("Nike", 123981);
        OrderedPair<String, Float> p3 = new OrderedPair<String,Float>("Adidas", 20.021F);

        //Was ist aber wenn man zu diesem Zeitpunkt noch gar nicht weiß welchen Datentyp der Parameter hat?
        OrderedPair<String, ProductId<Integer>> p4 = new OrderedPair<>("Puma", new ProductId<Integer>(1));

        System.out.println("P1: "+p1.getValue());
        System.out.println("P2: "+p2.getValue());
        System.out.println("P3: "+p3.getValue());
        System.out.println("P4: "+p4.getValue().get());


    }
}
