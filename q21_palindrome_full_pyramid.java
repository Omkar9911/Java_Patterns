// Q 21 palindrome_half_pyramid
// Enter size of trianle = 
// 5
//               1
//             2 3 2
//           3 4 5 4 3
//         4 5 6 7 6 5 4
// 

import java.util.Scanner;

public class q21_palindrome_full_pyramid 
{
    public static void main(String[] args) {
        
    
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of Pyramid = ");
    int n = sc.nextInt();

    for(int i=1; i<=n; i++)
    {
        for(int j=n; j>=i; j--)
        {
            System.out.print("  "); //space
        }
        // 1st half part 
        for (int j = i; j <= 2 * i - 1; j++) {
            System.out.print(j + " ");
        }
         //2nd part
        for (int j = 2 * i - 2; j >= i; j--) {
            System.out.print(j + " ");
        }

        System.out.println();

    }

  
}
}

