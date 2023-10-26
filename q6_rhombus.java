//Q 6. Rhombus star
  //        * * * * *
  //         * * * * *
  //          * * * * *
  //            * * * * *

import java.util.*;

public class q6_rhombus 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of rhombus = ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        System.out.print(" ");  
      }
      for(int k=1; k<=n;k++)
      {
        System.out.print( " *");
      }
      System.out.println();
    }

  }
  
}
