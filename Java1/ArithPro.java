import java.util.Scanner;       //importing Scanner class.

public class ArithPro {
    static int generateAP(int a, int d, int n)          //Method to generate Arithmetic Progression of given nth term.
    {
        if ( n == 1)
        {
            System.out.print(a + " ");
            return a;
        }
        int temp = generateAP(a, d, n-1) + d;
        System.out.print(temp + " ");
        return temp;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n(no of terms) : ");
        int n = sc.nextInt();
        System.out.print("Enter a(First term) : ");
        int a = sc.nextInt();
        System.out.print("Enter d(difference) : ");
        int d = sc.nextInt();
        sc.close();

        if ( n <= 0)            //input validation.
        {
            System.out.println("Error, value of n is less than or equal to 0. Exiting the program...");
        }
        else
        {
            generateAP(a, d, n);
        }


    }
}
