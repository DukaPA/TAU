package section12;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collections {

    public static void main(String[] args) {

        //Set
        System.out.println("\n========SET=======\n");
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        //List
        System.out.println("\n========LIST=======\n");
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");

        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
        System.out.println(fruits);

        //queue
        System.out.println("\n========QUEUE=======\n");
        Queue fru = new LinkedList();
        fru.add("apple");
        fru.add("lemon");
        fru.add("banana");
        fru.add("orange");
        fru.add("lemon");

        System.out.println(fru.size());
        System.out.println(fru);

        fru.remove();//removes first elemnt from queue called head
        System.out.println(fru);
        System.out.println(fru.size());

        System.out.println(fru.peek());//returns the head of the queue
        fru.add("strawberry");
        System.out.println(fru);
        System.out.println(fru.size());

        //Map
        System.out.println("\n========MAP=======\n");
        Map fruitCalorries = new HashMap();
        fruitCalorries.put("apple",95);
        fruitCalorries.put("lemon",20);
        fruitCalorries.put("banana",105);
        fruitCalorries.put("orange",45);
        fruitCalorries.put("lemon",18);

        System.out.println(fruitCalorries.size());
        System.out.println(fruitCalorries);

        System.out.println(fruitCalorries.get("lemon"));

        System.out.println(fruitCalorries.entrySet());

        fruitCalorries.remove("orange");
        System.out.println(fruitCalorries.size());
        System.out.println(fruitCalorries);


    }



}
