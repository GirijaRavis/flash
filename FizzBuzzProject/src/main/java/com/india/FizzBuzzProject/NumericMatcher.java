package com.india.FizzBuzzProject;

public abstract class NumericMatcher implements Matcher {
	 
	
	    public String evaluate(int value) {
	        String defaultResult = "";
	        String output = getOutput();
	        return value % getValueToDivide() == 0 ? output : defaultResult;
	    }

	    protected abstract int getValueToDivide();

	    protected abstract String getOutput();

}
