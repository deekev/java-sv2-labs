package algorithmsdecision;

public class Prime {

    public boolean isPrime(int number) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}