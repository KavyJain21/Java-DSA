package backtracking;

public class Subset {
    public static void findSubset(String str, String ans,int i){
       //base
       if(i==str.length()){
        System.out.println(ans);
        return;
       }
       //yes
            findSubset(str, ans+str.charAt(i), i+1);
       //no
         findSubset(str, ans , i+1);
    }


    public static void main(String[] args) {
        String str ="abc";
        findSubset(str, " ", 0);
    }
}
