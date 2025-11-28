package Hashing;
import java.util.*;
public class IteratorsInHashSet {
    public static void main(String[] args) {
        HashSet<String>cities=new HashSet<>();
        cities.add("jabalpur");
        cities.add("mumbai");
        cities.add("noida");
        cities.add("bengaluru");

       /* METHOD1
        Iterator it = cities.iterator();
         while (it.hasNext()) {
           System.out.println(it.next()); 
         }
           METHOD2    */
           for(String city:cities){
            System.out.println(city);
           }
    }
}
