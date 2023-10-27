// Q 11 K Pattern
//  * * * * *                        
//  * * * *
//  * * *
//  * *
//  *
//  *
//  * *
//  * * *
//  * * * *
//  * * * * *

import java.util.*;
public class q11_k_pattern 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of K pattern = ");
    int n = sc.nextInt();

    // 1st part
    for(int i=1; i<=n; i++)
    {
      for(int j=n; j>=i; j--)
      {
        System.out.print(" *");
      }
      System.out.println();
    }

    // 2nd part
    for(int i=1 ; i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        System.out.print(" *");
      }
      System.out.println();
    }


    
  }
  
}
