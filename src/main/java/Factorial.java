import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial of it : ");
        int num = scan.nextInt();
        int result=1;

        while(num>0) {
            result*=num;
            num--;
        }

        System.out.println("Sonuc : "+result);

    }
}
