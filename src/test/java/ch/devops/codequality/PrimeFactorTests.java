package ch.devops.codequality;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootTest
public class PrimeFactorTests {

    @Test
    public void testPrimeFactorsFor1() {
        PrimeFactor pf = new PrimeFactor();
        List<Integer> expected = Collections.emptyList();
        Assert.assertEquals(expected, pf.primeFactors(1));
    }

    @Test
    public void testPrimeFactorsFor2() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Collections.singletonList(2), pf.primeFactors(2));
    }

    @Test
    public void testPrimeFactorsForPrimeNumber() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Collections.singletonList(7), pf.primeFactors(7));
    }

    @Test
    public void testPrimeFactorsForCompositeNumber() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Arrays.asList(2, 2, 3, 5), pf.primeFactors(60));
    }

    @Test
    public void testPrimeFactorsForSquareOfPrime() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Arrays.asList(5, 5), pf.primeFactors(25));
    }

    @Test
    public void testPrimeFactorsForLargePrimeNumber() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Collections.singletonList(9973), pf.primeFactors(9973));
    }

    @Test
    public void testPrimeFactorsForLargeCompositeNumber() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Arrays.asList(3, 3, 5, 5, 5, 5, 2333), pf.primeFactors(13123125));
    }

    @Test
    public void testPrimeFactorsForNegativeNumber() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Collections.emptyList(), pf.primeFactors(-20));
    }

    @Test
    public void testPrimeFactorsForZero() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Collections.emptyList(), pf.primeFactors(0));
    }

    @Test
    public void testPrimeFactorsForNumberWithOnlyTwoFactors() {
        PrimeFactor pf = new PrimeFactor();
        Assert.assertEquals(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5),
                pf.primeFactors(1000000000));
    }
}
