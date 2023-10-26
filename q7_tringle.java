  // Q 7. Triangle star
  //             *
  //            * *
  //           * * *
  //          * * * *
  //         * * * * *

import java.util.*;

public class q7_tringle 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter size of triangle = ");
    
    int n =sc.nextInt();

    for(int i=1; i<=n; i++)
    {
      for(int j=n; j>=i; j--)
      {
        System.out.print(" ");
      }
      for(int k=1; k<=i; k++)
      {
        System.out.print( " *");
      }
      System.out.println();
    }
    
  }
}
