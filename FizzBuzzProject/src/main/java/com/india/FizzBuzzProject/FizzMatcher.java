package com.india.FizzBuzzProject;

public class FizzMatcher extends NumericMatcher{
	 private static final int VALUE_TO_DIVIDE = 3;
	    private static final String FIZZ = "FIZZ";

	    @Override
	    protected int getValueToDivide() {
	        return VALUE_TO_DIVIDE;
	    }

	    @Override
	    protected String getOutput() {
	        return FIZZ;
	    }

}
