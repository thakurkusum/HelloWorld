public class PrimeNumber {
    public static void main (String[]args){
// not working
        int num =7;
        boolean flag =false;
        for (int i= 1; i<=num/2; ++i){

            if(num % i == 0){
                flag = true;
                break;
            }

        }
        if (!flag)
                 System.out.println(num + "is not a prime number.");
        else
            System.out.println(num + "is  a prime number.");
    }
}
