package Array;

public class BinarySearch {
    public static int Search(int arr[],int key){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
        
        if(arr[mid]==key){
            return mid;
        }else if(arr[mid]<key){
            start=mid+1;
        }else{
            start=mid-1;
        }
        }
       return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,9,10,12,23};
        int key=23;
        System.out.println(Search(arr, key));
    }
}
