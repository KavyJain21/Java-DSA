package HEAP;
import java.util.*;
public class InsertInHeap {
    static class  Heap {
    ArrayList<Integer>arr=new ArrayList<>();
    public void add(int data){
// add at last index
 arr.add(data);
 int x = arr.size()-1; // child index
 int parent=(x-1)/2;
 while (arr.get(x)<arr.get(parent)) {
    int temp=arr.get(x);
    arr.set(x, arr.get(parent));
    arr.set(arr.get(parent), temp);
 }
    }    
    public int peek(){
        return arr.get(0);
    }
    }
    public static void main(String[] args) {
        
    }
}
