public class Factorial2 {

    public static int factorialCalculate(int num) {
        if(num<1) {
            return num--;
        }
        else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result=1;

        while(num>0) {
            result*=factorialCalculate(num+1);
        }

        System.out.println(result);
    }


}
