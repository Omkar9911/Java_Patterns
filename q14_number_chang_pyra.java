// Q14 number change pyramid
// Enter size of Pyramid = 4
// 
// 1
// 2 3
// 4 5 6
// 7 8 9 10 

import java.util.Scanner;

public class q14_number_chang_pyra
{
  public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Pyramid = ");
    int n = sc.nextInt();

    int a=1;

    for(int i=1;i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        System.out.print( a + " ");
        a++;
      }
      System.out.println();
    }

  }
}