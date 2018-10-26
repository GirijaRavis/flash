package com.india.FizzBuzzProject;

import java.util.List;

public class FizzBuzzer {
	private List<Matcher> matcherList;

    public FizzBuzzer(List<Matcher> matcherList) {
        this.matcherList = matcherList;
    }

    /**
     * Use the value passed as argument as argument of the evaluate method for all the matchers stored in matcherList.
     *
     * @param value to evaluate
     * @return the concatenation of all the matcher's evaluate result.
     */
    public String execute(Integer value) {
        return executeMatchers(value);
    }

    private String executeMatchers(Integer value) {
        String result = "";
        for (Matcher matcher : matcherList) {
            result += matcher.evaluate(value);
        }
        return result;
    }

}
