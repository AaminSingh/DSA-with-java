package arrays;

public class kadanealgo2 {
    public static void KadanesAlgo(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        boolean allNegative = true;
        for(int i=0;i<nums.length;i++){
             cs += nums[i];
             if(cs < 0){
                    cs = 0;
                }
                ms = Math.max(cs,ms);
             if(nums[i]>=0){
                 allNegative = false;
             }

        }   if(allNegative == true){
               int largestnumber = Integer.MIN_VALUE;
                for( int j=0;j<nums.length;j++){
                   if(largestnumber<nums[j]){
                    largestnumber = nums[j];
                   }
                }
            System.out.println("largest number is: "+ largestnumber);
            }
            System.out.println("maximum number :" + ms);
    }
    public static void main(String args[]){
        int nums[] = {-1,-2,-3,-5};
        KadanesAlgo(nums);
    }
}
