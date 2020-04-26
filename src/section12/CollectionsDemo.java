package section12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CollectionsDemo {
    public static void main(String[] args) {
//        setDemo();
//        listDemo();
//        queueDemo();
        mapDemo();
    }

    public static void setDemo(){
        Set<String> fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        //using iterator to loop threw collection
        var i = fruit.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        //enhace
        for(String item: fruit){
            System.out.println(item);
        }
        //for each
        fruit.forEach(System.out::println);
    }

    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.get(2));
        System.out.println(fruit.size());
        System.out.println(fruit);
    }

    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.remove();//removes first elemnt from queue called head
        System.out.println(fruit);
        System.out.println(fruit.size());

        System.out.println(fruit.peek());//returns the head of the queue
        fruit.add("strawberry");
        System.out.println(fruit);
        System.out.println(fruit.size());
    }

    public static void mapDemo(){
        Map<String, Integer> fruitCalorries = new HashMap();
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

        //for
        for(var entry : fruitCalorries.entrySet()){
            System.out.println(entry.getValue());
        }

        //for each
        fruitCalorries.forEach((k,v) -> System.out.println("Fruit: " +k + " Calories: " + v ));
    }
}
