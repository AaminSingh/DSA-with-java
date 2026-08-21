package arrays;

import java.util.HashSet;

public class distinctelementhashset {

    public static boolean haveDistinctelements(int nums[]){
        HashSet<Integer> newlist = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(newlist.contains(nums[i])){
                return true;
            }
            newlist.add(nums[i]);
        }
        return false;
    }
    public static void main(String args[]){
    int nums[] = {1,3,2,1,4};
    System.out.println(haveDistinctelements(nums));
}}
