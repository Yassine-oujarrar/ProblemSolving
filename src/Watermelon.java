import java.util.Scanner;
/* Description of the problem : https://codeforces.com/problemset/problem/4/A */
public class Watermelon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("Yes");


        }
        else if (num >= 2) {
            System.out.println("No !");
        }
        else if (num % 2 == 1) {
            System.out.println("No");

        }
    }
}
