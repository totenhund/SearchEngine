package com.company.evaluatorFactory;

import com.company.evaluator.Evaluator;
import com.company.evaluator.criteries.TrustEvaluator;

public class TrustEvaluatorFactory implements EvaluatorFactory {
    @Override
    public Evaluator createEvaluator() {
        return new TrustEvaluator();
    }
}
