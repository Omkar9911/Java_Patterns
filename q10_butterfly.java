// Q 10. Butterfly

//  *                 *
//  * *             * *
//  * * *         * * *
//  * * * *     * * * *
//  * * * * * * * * * *
//  * * * * * * * * * *
//  * * * *     * * * *
//  * * *         * * *
//  * *             * *
//  *                 *

import java.util.*;
public class q10_butterfly
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Butterfly = ");
    int n = sc.nextInt();

    //  1st part
    for(int i=1; i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        System.out.print(" *");
      }

      for(int j=1;j<=2*(n-i); j++)
      {
        System.out.print("  ");
      }
      
      for(int j=1; j<=i; j++)
      {
        System.out.print(" *");
      }

      System.out.println();

     
    }


    // 2nd part
    for(int i=1; i<=n; i++)
    {
      for(int j=n; j>=i; j--)
      {
        System.out.print(" *");
      }

      for(int j=1;j<=(2*i)-2; j++)
      {
        System.out.print("  ");
      }
      
      for(int j=n; j>=i; j--)
      {
        System.out.print(" *");
      }

      System.out.println();

     
    }
    
  }
  
}
