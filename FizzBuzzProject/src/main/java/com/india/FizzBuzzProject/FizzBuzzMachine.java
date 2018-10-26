package com.india.FizzBuzzProject;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzzMachine {
	
	private final FizzBuzzer fizzBuzzer;

    public FizzBuzzMachine() {
        List<Matcher> fizzBuzzMatchers = new LinkedList<Matcher>();
        fizzBuzzMatchers.add(new FizzMatcher());
        fizzBuzzMatchers.add((Matcher) new BuzzMatcher());
        fizzBuzzer = new FizzBuzzer(fizzBuzzMatchers);
    }

    /**
     * Main FizzBuzzMachine method. This method will check if the number passed as parameter is fulfilling the condition
     * and will return the Fizz, Buzz or FizzBuzz value.
     *
     * @param value to analyze.
     * @return Fizz if the value is multiple of 3
     * Buzz if the value is multiple of 5
     * FizzBuzz if the value is multiple of 3 and 5
     * the value if the parameter isn't multiple of 3 or 5
     */
    public String execute(Integer value) {
        String result = fizzBuzzer.execute(value);
        return result.isEmpty() ? value.toString() : result;
    }


}
