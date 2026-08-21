package arrays;

public class distinctelements {

    public static boolean distinctElement(int nums[]){
        boolean distinctelement = true;
        int temp = 0;
     for(int i=0;i<nums.length-1;i++){
        temp = nums[i];
        for(int j=i+1;j<nums.length;j++){
           if(temp == nums[j]){
               distinctelement = false;
               break;
           }
        }
     }
     return distinctelement;

    }
    public static void main(String args[]){
    int nums[] = {1,3,2,1,4};
    System.out.print(distinctElement(nums));
}}
