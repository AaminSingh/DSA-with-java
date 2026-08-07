package arrays;

public class subarrays {
    public static void Subarrays(int nums[]){
        int totalsubarrays = 0;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length-1;j++){
                int end = j;
                for(int k=start;k<=end;k++){        //only to print
                    System.out.print(nums[k]+" ");
                }
                totalsubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays"+ totalsubarrays);
    }
    public static void main(String args[]){
        int nums[] = {2,4,6,8,10};
        Subarrays(nums);
       
    }
}
