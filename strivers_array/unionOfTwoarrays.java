package strivers_array;

public class unionOfTwoarrays {
    public static int[] unionOfTwoarrays(int[] num1,int[] num2){
        int[] temp = new int[num1.length+num2.length];
        int index  = 0;
        
        int i = 0;
        int j = 0;
        while(i<num1.length && j<num2.length){
          
            if(num1[i]<num2[j]){
                 if(index==0 || num1[i] != temp[index-1]){
                temp[index] = num1[i];
                index++;
                 }
                 i++;

            }else if(num1[i]>num2[j]){
                 if(index==0 || num2[j] != temp[index-1]){
                temp[index] = num2[j];
                index++;
                 }
                j++;
            } 
            else if(num1[i] == num2[j]){
            if(index==0 || temp[index-1]!=num1[i]){
                temp[index] = num1[i];  
                index++;   
            }   
              i++;
              j++;          
        }
        
          }
          
        while(i<num1.length){
            if(index ==0 || temp[index-1] != num1[i]){
            temp[index] = num1[i];
            
            index++;
            }
            i++;
        }
            while(j<num2.length){
                if(index ==0 || temp[index-1] != num2[j]){
                temp[index] = num2[j];
                index++;
                }
            j++;
            }

 return temp;
}
    public static void main(String args[]){
        int num1[] = {1,2,3,4,5,6,7,8,9,10};
        int num2[] = {2,3,4,4,5,11,12};
        int[] temp = unionOfTwoarrays(num1, num2);
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i] +" ");
        }
    }
}
