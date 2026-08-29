package strivers_array;

import arrays.arrays01;

public class rotatearray {
    public static void rotatearray(int nums[]){
        int temp = nums[0];
        int lastIndex = nums.length-1;
        for(int i=0;i<nums.length-1;i++){    
         nums[i] = nums[i+1];
        }
        nums[lastIndex] = temp;
    }
     


    public static void main(String args[]){
        int nums[] = {1,4,6,7,9};
        rotatearray(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }

}