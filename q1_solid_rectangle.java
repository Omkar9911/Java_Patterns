  //Q 1. Solid rectangle star
  //        * * * * *
  //        * * * * *
  //        * * * * *
  //        * * * * *


  import java.util.*;

  public class q1_solid_rectangle
  {
    public static void main(String args[])
    
    {
      Scanner sc = new Scanner(System.in); 
  
      System.out.println("Enter no of rows = ");
      int rows = sc.nextInt();
      System.out.println("Enter no of coloumns = ");
      int col = sc.nextInt();
  
      for(int i=1; i<=rows; i++)
      {
        for(int j=1; j<=col; j++)
        {
          System.out.print(" *");
        }
        System.out.println();
      }
  
    }
  }