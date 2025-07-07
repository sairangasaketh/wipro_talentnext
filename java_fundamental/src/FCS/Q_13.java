package FCS;

public class Q_13 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 10 and 99:");
        for (int num = 10; num < 100; num++) {
            if (checkIfPrime(num)) {
                System.out.print(num + "\t");
            }
        }
    }

    public static boolean checkIfPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
