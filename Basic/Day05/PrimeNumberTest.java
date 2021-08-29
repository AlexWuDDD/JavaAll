public class PrimeNumberTest {
    public static void main(String[] args) {
        int count = 0;
        long t1 = System.currentTimeMillis();
        for(int i = 1; i <=100000; ++i){
            if(isPrime2(i)){
                // System.out.println(i);
                ++count;
            }
        }
        long t2 = System.currentTimeMillis();
        System.out.println("time cost: " + (t2-t1));
        System.out.println("count: " + count);
    }

    private static boolean isPrime1(int i){
        for(int j=2; j < i; ++j){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime2(int i){
        for(int j = 2; j <= Math.sqrt(i); ++j){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }

    private static boolean isPrime3(int i){
        
        return false;
    }
}
