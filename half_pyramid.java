//Q 3. Half Pyramid star
  //        * 
  //        * * 
  //        * * * 
  //        * * * * 
  //        * * * * *
  
import java.util.*;
public class half_pyramid 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size of pyramid = ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
      for(int j=1; j<=i; j++)
      {
        System.out.print(" *");
      }
      System.out.println();
    }

  }
}
