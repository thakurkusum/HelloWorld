import java.util.Scanner;

public class MultificationTable {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the number");
        int num = 0;
        int number = obj.nextInt();
        for(int i = 1; i <=10; ++i){

            System.out.printf(" %d * %d = %d \n", num, i, num * i);

        }
    }
}

