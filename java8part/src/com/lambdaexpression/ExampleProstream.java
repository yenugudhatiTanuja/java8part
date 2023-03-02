package com.lambdaexpression;
import java.util.ArrayList;
import java.util.List;

public class ExampleProstream {

    static List<String> items = new ArrayList<>();

    public static List getItems(){

        items.add("Fruit, Orange");
        items.add("Fruit, Apple");
        items.add("Fruit, Watermelon");
        items.add("Vegtable, Potato");
        items.add("Vegtable, Carrot");

        return items;
    }

    public static void main( String[] args ) {

        List<String> myItems = getItems();
        System.out.println("Items fruits Category:");
        
        myItems.stream().filter((p) -> p.startsWith("Fruit"))
                .sorted().forEach((p) -> System.out.println(p));
    }

}
//.filter((p) -> p.startsWith("Fruit"))
//.map((p) -> p.toUpperCase())
