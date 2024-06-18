import java.util.Scanner;
/* Description of the problem : https://codeforces.com/group/MWSDmqGsZm/contest/219432/problem/Q*/
public class Digits {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many digits u want ");
        int x = scanner.nextInt();


        for (int i = 0 ; i < x; i++){
            System.out.println("Enter the number of digits");
            int num = scanner.nextInt();

            while (num != 0){ 
                
            int digit = num % 10;

            System.out.print(digit + " ");

            num /= 10;
        }
    

}
}
}