import java.util.Scanner;

/**10. Write a program to input any number and check if it Armstrong number or not
 153 = (1*1*1)+(5*5*5)+(3*3*3)
 where:
 (1*1*1)=1
 (5*5*5)=125
 (3*3*3)=27
 So:
 1+125+27=153
 *
 */

public class Program_10 {

    public static void main(String[] args) {

        int a, arm = 0, n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check Armstrng number or not: ");
        n = sc.nextInt();
        temp = n;

        for (; n != 0; n /= 10) {
            a = n % 10;
            arm = arm + (a * a * a);
        }
        if (arm == temp)
            System.out.println(temp + " is a Armstrong number.");
        else
            System.out.println(temp + " is not a Armstrong number. ");
    }
}