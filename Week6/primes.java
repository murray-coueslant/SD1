public class primes{
    public static void main(String args[]){
        isPrime(2147483647);
        isPrimeSlow(2147483647);
    }
    //checks whether an int is prime or not.
    static void isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) System.out.println("false");
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                System.out.println("false");
        }
        System.out.println("true");
    }

    //checks whether an int is prime or not.
    static void isPrimeSlow(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                System.out.println("false");
        }
        System.out.println("true");
    }
}