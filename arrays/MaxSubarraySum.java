package arrays;

public class MaxSubarraySum {
    public static void Maxsubarraysum(int nums[]){
        int Maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<nums.length;i++){
            int start = i;
            for(int j=i;j<nums.length;j++){
             int end = j;
             currSum = 0;
                for(int k=start;k<end;k++){
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if(Maxsum < currSum){
                    Maxsum = currSum;
                }
            }
        }
        System.out.println("the maximum sum is " + Maxsum);
    }

    public static void main(String args[]){
        int nums[] = {1,-2,3,4,6,8};
        Maxsubarraysum(nums);
        
    }
}
