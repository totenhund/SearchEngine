package com.company.evaluatorFactory;

import com.company.evaluator.Evaluator;
import com.company.evaluator.criteries.TrustEvaluator;

/**
 * The type Trust evaluator factory.
 */
public class TrustEvaluatorFactory implements EvaluatorFactory {
    @Override
    public Evaluator createEvaluator(Evaluator evaluator) {
        return new TrustEvaluator(evaluator);
    }
}
