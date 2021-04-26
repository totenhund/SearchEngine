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
    }

    @Override
    public float getRating(Website website) {
        return wrapper.getRating(website) + evaluateVisits(website);
    }

    private float evaluateVisits(Website website) {
        return 3f;
    }
}
