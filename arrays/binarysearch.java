package arrays;
import java.util.*;

public class binarysearch {

    public static int binarySearch(int numbers[], int key){
        int start = 0;
        int end = numbers.length -1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(key == numbers[mid]){
              return mid;
            }else if(key>numbers[mid]){
              start = mid + 1;  
            }else if(key<numbers[mid]){
              end = mid - 1;
            }
            
        }
        return -1;
    }
  public static void main(String args[]){
    int numbers[] = {2,3,6,7,9,12};
    int key = 5;
    System.out.println("the middle value is " + binarySearch(numbers, key)
     );  
}   
}
