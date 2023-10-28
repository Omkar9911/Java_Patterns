// Q 20 hollow_half_pyramid
// Enter size of Pyramid = 
// 5
// 1
// 1 2
// 1   3
// 1     4
// 1 2 3 4 5

import java.util.Scanner;

public class q20_hollow_half_pyramid 
{
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Pyramid = ");
    int n = sc.nextInt();

    for(int i=1 ; i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        if(i==1 ||j==1 ||j==i ||i==n)
        {
          System.out.print(j + " "); 
        }
        else{
          System.out.print("  ");
        }
      }
      System.out.println();
    }

  }
  
}
