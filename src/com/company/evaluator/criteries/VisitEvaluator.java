package com.company.evaluator.criteries;

import com.company.evaluator.Evaluator;
import com.company.website.Website;

/**
 * The type Visit evaluator.
 */
public class VisitEvaluator implements Evaluator {

    protected Evaluator wrapper;

    /**
     * Instantiates a new Visit evaluator.
     */
    public VisitEvaluator(Evaluator source) {
        wrapper = source;
        System.out.println("Visit evaluator is created");
    }

    @Override
    public float getRating(Website website) {
        return 0;
    }
}
