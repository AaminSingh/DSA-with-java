package strivers_array;

import java.util.Arrays;

public class rotatearraybyKplaces {
    public static void rotatearraybyKelements(int nums[],int k){
        int[] temp = Arrays.copyOf(nums, k);
        for(int i=0;i<nums.length;i++){
        while(i<nums.length-k){
         nums[i] = nums[i+k];
         i++;
        }
            nums[nums.length-k+1] = temp[0];
            nums[nums.length-k] = temp[1];

    }}
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5,6,7};
        int k = 2;
        rotatearraybyKelements(nums, k);
        for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
        }
    }
}
