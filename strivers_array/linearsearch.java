package strivers_array;

public class linearsearch {
    public static boolean linearsearch(int nums[],int key){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                return true; 
            }
        }
    return false;

    }
    public static void main(String args[]){
        int nums[] = {2,5,7,1,6,9};
        int key = 9;
        System.out.println(linearsearch(nums, key));;
    }
}
