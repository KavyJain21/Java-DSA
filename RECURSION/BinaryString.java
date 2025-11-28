package RECURSION;

public class BinaryString {
    public static void BinString(int n, int LastPlace,StringBuilder str){
     if(n==0){
        System.out.println(str);
        return;
     }

     BinString(n-1, 0, str.append("0"));
     if(LastPlace==0){
        BinString(n-1, 1, str.append("1"));
     }
    }

    public static void main(String[] args) {
       BinString(3, 0, new StringBuilder(""));
    }
}
