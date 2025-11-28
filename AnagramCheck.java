import java.util.*;
public class AnagramCheck {
    public static boolean areAnagrams(String str1, String str2) {
      
   
        if (str1.length() != str2.length()) {
            return false;
        }

       
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

     
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";

        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }
}
