package ch.devops.codequality;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

    public List<Integer> primeFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }

}




