package com.company.evaluator.criteries;

import com.company.evaluator.Evaluator;
import com.company.website.Website;

/**
 * The type Trust evaluator.
 */
public class TrustEvaluator implements Evaluator {

    /**
     * Instantiates a new Trust evaluator.
     */
    public TrustEvaluator() {
        System.out.println("Trust evaluator is created");
    }

    @Override
    public float getRating(Website website) {
        return 0;
    }
}
