//Q 18 zero_one
// Enter size of Pyramid = 
// 4
// 1
// 0 1
// 0 1 0
// 1 0 1 0

import java.util.Scanner;

public class q18_zero_one {
  public static void main(String[] args) 
  {
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Pyramid = ");
    int n = sc.nextInt();
    int a=1;

    for(int i=1 ; i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        
        if(a%2==0)
        {
          System.out.print("0 ");
        }
        else
        {
          System.out.print("1 ");
        }
        a++;
      }
      
      
       System.out.println();
    }
    

  }
}
