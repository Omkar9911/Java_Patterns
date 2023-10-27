// Q 17 palindrome_triangular 
// Enter size of Trangular = 
// 4
//         1
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4

import java.util.Scanner;

public class q17_palindrome_triangular 
{
  public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Trangular = ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
      for(int j=n; j>=i; j--)
      {
        System.out.print("  ");
      }
      for(int j=i; j>=1; j--)
      {
        System.out.print(j + " ");
      }
      for(int j=2; j<=i; j++)
      {
        System.out.print(j + " ");
      }
      
      System.out.println();

      
    }

  }
  
}
