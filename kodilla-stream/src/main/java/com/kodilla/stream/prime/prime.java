class prime {

    public static boolean isPrime(int x){

        if(x<2) return false;
        else
        for(int i = 2; i<x; i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }

    public static int primeTh(int x){
        int count = 0;
        int result = 0;

        for(int i = 2; count < x; i++){
            if( isPrime(i) ){
                count++;
                result = i;
            }
        }

        return result;
    }

    public static void main (String[] args) {

        int number = 0;
        System.out.println("Is number " + number + " prime? " + isPrime(number));

        int th = 7;
        System.out.println("\nThe " + th + "th of prime number is " + primeTh(th));

    }
}