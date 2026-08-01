package strivers_array;

public class movezerostoend {
    public static void moveZerosToEnd(int nums[]){
        int j=-1;
        int temp = -1;
       for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j = i;
                break;
            }
          }
            for(int i=j+1;i<nums.length;i++){        
              if(nums[i] != 0){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp; 
                j++;
            }  
       }
}
    public static void main(String args[]){
        int nums[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZerosToEnd(nums);
       for(int i=0;i<nums.length;i++){
        System.out.print(nums[i]+" ");
      }
        
    }
}
