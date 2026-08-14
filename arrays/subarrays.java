package arrays;

import javax.print.DocFlavor.INPUT_STREAM;

public class subarrays {
    public static void Subarrays(int nums[]){
        int totalsubarrays = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int start = i;

            for(int j=i;j<nums.length;j++){
                int sum = 0;

                int end = j;
                for(int k=start;k<=end;k++){   
                         //only to print
                    System.out.print(nums[k]+" ");
                    sum += nums[k];
                   
                }
                 if(sum>max){
                        max = sum;
                    }
                    if(sum<min){
                         min = sum;
                    }
                totalsubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays"+ totalsubarrays);
        System.out.println(max);
        System.out.println(min);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        Subarrays(nums);
       
    }
}
