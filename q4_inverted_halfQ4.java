//Q 4. inverted half pyramid star
  //        * * * * *
  //        * * * * 
  //        * * * 
  //        * * 
  //        *

import java.util.*;
public class q4_inverted_halfQ4 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of pyramid = ");
    int n =sc.nextInt();

    for(int i=1; i<=n; i++)
    {
      for(int j=n; j>=i; j--)
      {
        System.out.print(" *");
      }
      System.out.println();
    }

  }
}
