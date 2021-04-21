package com.company.evaluator.criteries;

import com.company.evaluator.Evaluator;
import com.company.website.Website;

/**
 * The type Time evaluator.
 */
public class TimeEvaluator implements Evaluator {

    /**
     * Instantiates a new Time evaluator.
     */
    public TimeEvaluator() {
        System.out.println("Time evaluator is created");
    }

    @Override
    public float getRating(Website website) {
        return 0;
    }
}
