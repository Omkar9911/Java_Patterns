// Q 16 zero one trangle
// Enter size of triangle = 4
// 
// 1
// 1 0
// 1 0 1
// 1 0 1 0

import java.util.Scanner;

public class q16_zero_one_tria 
{
  public static void main(String[] args)
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of triangle = ");
    int n = sc.nextInt();
 
    for(int i=1 ; i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        if(j%2==0)
        {
          System.out.print("0 ");
        }
        else
        {
          System.out.print("1 ");
        }
       
      }
       System.out.println();
    }

  }
  
}
