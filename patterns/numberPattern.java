package patterns;

public class numberPattern {
    public static void main(String[] var0) {
     int n = 5;
         for(int i=1;i<=n;i++){
             for(int j=1 ;j<= n-i+1;j++){    //here we are keeping the spaces in mind as well
              System.out.print(j);
           }
           System.out.println();
        }

   }
}
