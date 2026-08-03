package strivers_array;

public class sortedarray {
    public static boolean isSortedArray(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
            
        }
        return true;
        
    }
    public static void main(String args[]){
        int nums[] = {2,5,1,7,9,6};
        System.out.println(isSortedArray(nums));
    }
}
