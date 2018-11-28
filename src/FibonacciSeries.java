import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        int n = 10, t1 = 0, t2 = 1;
        System.out.println("first write the terms:");
        int number = obj.nextInt();
        for (int i =1; i <= n; ++i){
            System.out.println(t1 +"+");
            int sum = t1+ t2;
            t1 = t2;
            t2 =sum;
        }
    }
}
