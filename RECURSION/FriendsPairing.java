package RECURSION;


public class FriendsPairing {
    public static int friends(int n){
        if(n==1||n==2){
            return n;
        }
        int fnm1= friends(n-1);
        int fnm2= friends(n-2);
        int pairways = (n-1)*fnm2;
        int totways= fnm1+pairways;
        return totways;
    }


    public static void main(String[] args) {
       System.out.println( friends(3));
    }
}
