public class Primes {
    public static void main(String[] args) {
       
        int num = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + num+":");


        boolean[] isPrime = new boolean[num+1];
        for (int i = 0; i < isPrime.length; i++) {      //innocent until proven guilty
            isPrime[i] = true;
        }

        isPrime[0] = false;                             //get these out of the way
        isPrime[1] = false;
        int counter = 0;

        for (int i = 2; i < isPrime.length; i++) {              //counting up and falsifying the multiples of any primes
            if (isPrime[i] == true) {
                for (int multiples = i;  multiples < num + 1;  multiples +=i ) {
                    isPrime[multiples] = false;
                }
                System.out.println(i);
                counter++;
            }
        }
        System.out.println("There are "+counter+" primes between 2 and "+num+" ("+100*counter/num+"% are primes)");
    }
}