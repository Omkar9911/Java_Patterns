import java.util.*;

public class q5_left_pyramid
 {
  public static void main(String args[])
  {

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter pyramid size = ");
      int n= sc.nextInt();

      for(int i=1; i<=n; i++)                            //row
      {
        for(int j=n; j>=i; j--)                          //spacing loop
        {
          System.out.print("  ");                      //print space
        }
        for(int k= 1; k<=i; k++)
        {
          System.out.print(" *");                      //print *
        }
        
        System.out.println();                            //next line
      }

  }
}
