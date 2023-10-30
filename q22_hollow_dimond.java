// Q22 hollow_dimond

// Enter size of Dimond = 
// 5
//       *
//      * *
//     *   *
//    *     *
//   *       *
//   *       *
//    *     *
//     *   *
//      * *
//       *

import java.util.*;

public class q22_hollow_dimond

{
  public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Dimond = ");
    int n = sc.nextInt();

    //  1st half part
    for(int i=1; i<=n; i++)
    {
      // space
      for(int j=n; j>=i; j--)
      {
        System.out.print(" ");
      }
      // stars
      for(int j=1; j<=i; j++)
      {
        if(j==1 ||j==i)
        {
        System.out.print(" *");
        }
        else{
          System.out.print( "  ");
        }
      }
      // new Line
      System.out.println();
    }


    //  2nd half part

    for(int i=1; i<=n; i++)
    {
      // space
      for(int j=1; j<=i; j++)
      {
        System.out.print(" ");
      }
      for(int j=n; j>=i; j--)
      {
        if(j==n || j==i){
        System.out.print(" *");
        }
        else
        {
          System.out.print("  ");
        }
      }
      System.out.println();
    }


    
  }
}
