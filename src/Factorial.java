import java.util.Scanner;
/* Description of the problem : https://codeforces.com/group/ndZ5Fwlwj8/contest/312340/problem/B*/
public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number ");
        int num = scanner.nextInt();
        int Factorial = getFactorial(num);
        //int i = 1;
        /*for (i = 1; i <= num; i++) {
            Factorial = Factorial * i;
        }*/
        if (Factorial % 2 == 0) {
            System.out.println("Yes");
            
        } else {
            System.out.println("No");
        }
        }
        public static int getFactorial(int num) {
            if(num == 0) return 1;
            return num * getFactorial(num - 1);

    }
}