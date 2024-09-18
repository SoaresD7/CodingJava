import java.util.Scanner;

public class ForI {
    public static void main(String[] args) {

            for (int i = 1; i <= 100; i++) {
                if (isPrime(i)) {
                    System.out.println("The number: " + i + " is prime");
                }

            }

        }

        public static boolean isPrime(int x) {

            int count = 2;

            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    count++;
                }
            }

            return count == 2;

        }

    }



