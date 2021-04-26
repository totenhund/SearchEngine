package com.company.evaluator.criteries;

import com.company.evaluator.Evaluator;
import com.company.website.Website;

/**
 * The type Trust evaluator.
 */
public class TrustEvaluator extends VisitEvaluator {

    /**
     * Instantiates a new Trust evaluator.
     */
    public TrustEvaluator(Evaluator evaluator) {
        super(evaluator);
    }

    @Override
    public float getRating(Website website) {
        return super.wrapper.getRating(website) + evaluateTrust(website);
    }

    private float evaluateTrust(Website website){
        return 4f;
    }
}
