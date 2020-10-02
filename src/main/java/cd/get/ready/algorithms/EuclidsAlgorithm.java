package cd.get.ready.algorithms;

public class EuclidsAlgorithm {

    public int gcd(int a, int b){
        if( a == 0){
            return b;
        }
        return gcd( b % a, a);
    }

}
