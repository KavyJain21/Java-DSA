package Hashing;
import java.util.*;
public class HashMapOperations {
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer>hm=new HashMap<>();
        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Germany", 50);
        System.out.println(hm);
        //Get
       int population= hm.get("India");
       System.out.println(population);
       System.out.println(hm.get("Japan"));
       //containsKey
          System.out.println(hm.containsKey("India"));//true
            System.out.println(hm.containsKey("Japan"));//false

            //remove
            System.out.println(hm.remove("China"));
            System.out.println(hm);
            //Size
            System.out.println(hm.size());
            //Is Empty
            System.out.println(hm.isEmpty());
            //clear
            hm.clear();
             System.out.println(hm.isEmpty());
    }
}
