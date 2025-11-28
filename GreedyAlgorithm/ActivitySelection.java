package GreedyAlgorithm;
import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        int MaxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity
        MaxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=0;i<end.length;i++){
            if(start[i]>=lastEnd){
                MaxAct++;//activity selected
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Max num of activities are:"+MaxAct);
        for(int i=0;i<ans.size();i++){
            System.out.println("A"+ans.get(i));
        }
    }
}
