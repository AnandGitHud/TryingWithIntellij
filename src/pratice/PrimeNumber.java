package pratice;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 23, count = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println(number+" is prime number");
        } else System.out.println( number +" is not prime number");

    }
}
