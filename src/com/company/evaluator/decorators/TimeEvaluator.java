package com.company.evaluator.decorators;

import com.company.evaluator.Evaluator;
import com.company.website.Website;

/**
 * The type Time evaluator.
 */
public class TimeEvaluator extends VisitEvaluator {

    /**
     * Instantiates a new Time evaluator.
     */
    public TimeEvaluator(Evaluator evaluator) {
        super(evaluator);
    }

    @Override
    public float getRating(Website website) {
        return super.wrapper.getRating(website) + evaluateTime(website);
    }

    private float evaluateTime(Website website){
        return 10f;
    }
}
