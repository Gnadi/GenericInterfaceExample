package com.company;

public class Main {

    public static void main(String[] args) {
        //OrderedPair kann mit jedem Parameter angelegt werden
        OrderedPair<String, String> p1 = new OrderedPair<String, String>("Airmax", "1000df382gS?8");
        OrderedPair<String, Integer> p2 = new OrderedPair<>("Nike", 123981);
        OrderedPair<String, Float> p3 = new OrderedPair<String,Float>("Adidas", 20.021F);

        //Was ist aber wenn man zu diesem Zeitpunkt noch gar nicht weiß welchen Datentyp der Parameter hat?
        OrderedPair<String, ProductId<Integer>> p4 = new OrderedPair<>("Puma", new ProductId<Integer>(1));

        //Ausgabe der Werte
        System.out.println("P1: "+p1.getValue());
        System.out.println("P2: "+p2.getValue());
        System.out.println("P3: "+p3.getValue());
        System.out.println("P4: "+p4.getValue().get());

        //Generic Method to compare two pairs
        OrderedPair<String, String> pc = new OrderedPair<String, String>("Airmax", "1000df382gS?8");
        OrderedPair<String, String> pc1 = new OrderedPair<>("Airmax", "1000df382gS?8");
        boolean same = Util.compare(pc,pc1);
        System.out.println(same);

        OrderedPair<String, Integer> pc2 = new OrderedPair<String, Integer>("Nike", 10373);
        OrderedPair<String, Integer> pc3 = new OrderedPair<>("Airmax", 234);
        boolean notsame = Util.<String, Integer>compare(pc2, pc3);
        System.out.println(notsame);


    }
}
