package arrays;

import java.util.Scanner;

public class arrays01 {
    
    public static void main(String[] var0) {
      int[] var1 = new int[100];
      Scanner sc = new Scanner(System.in);
      var1[0] = sc.nextInt();
      var1[1] = sc.nextInt();
      var1[2] = sc.nextInt();
      System.out.println("phys" + " " +var1[0]);
      System.out.println("chem" +" " + var1[0]);
      System.out.println("maths" +" " + var1[0]);
   }
}
