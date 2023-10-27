// Q 15 number_incre_reverce 
// Enter size of Pyramid = 4
// 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

import java.util.*;

public class q15_number_incre_reverce 
{
  public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Pyramid = ");
    int n = sc.nextInt();


    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
          System.out.print(j + " ");
      }
      System.out.println();
  }

  }

}
