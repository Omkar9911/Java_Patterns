// Q 12 number triangle
// Enter size = 5
//  
//      1 
//     2 2 
//    3 3 3 
//   4 4 4 4 
//  5 5 5 5 5 

import java.util.*;
public class q12_number_triangle 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size = ");
    int n = sc.nextInt();

     // 1 st part
    for(int i=1; i<=n; i++)
    {
      for(int j=n; j>=i; j--)
      {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
        System.err.print(i + " ");
      }
      System.out.println();
    }

  }
  
}
