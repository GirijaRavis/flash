package com.india.FizzBuzzProject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzMachineTest {
	
	private static final String FIZZ = "FIZZ";
    private static final String BUZZ = "BUZZ";
    private static final String FIZZBUZZ = "FIZZBUZZ";

    private FizzBuzzMachine fizzBuzzMachine;

    @Before
    public void setUp() throws Exception {
        fizzBuzzMachine = new FizzBuzzMachine();
    }

    @Test
    public void shouldReturnFizzWithTheValueThree() {
        assertEquals(FIZZ, fizzBuzzMachine.execute(3));
    }

    @Test
    public void shouldReturnBuzzWithTheValueFive() {
        assertEquals(BUZZ, fizzBuzzMachine.execute(5));
    }

    @Test
    public void shouldReturnFizzBuzzWithTheValueFifteen() {
        assertEquals(FIZZBUZZ, fizzBuzzMachine.execute(15));
    }

    @Test
    public void shouldReturnTheValueWithNoMultipleValue() {
        assertEquals("7", fizzBuzzMachine.execute(7));
    }

    @Test
    public void shouldReturnFizzWithAMultipleOfThree() {
        assertEquals(FIZZ, fizzBuzzMachine.execute(9));
    }

    @Test
    public void shouldReturnBuzzWithAMultipleOfFive() {
        assertEquals(BUZZ, fizzBuzzMachine.execute(50));
    }

    @Test
    public void shouldReturnFizzBuzzWithAMultipleOfThreeAndFive() {
        assertEquals(FIZZBUZZ, fizzBuzzMachine.execute(90));
    }

}
