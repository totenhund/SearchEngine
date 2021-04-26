package com.company.evaluatorFactory;

import com.company.evaluator.Evaluator;
import com.company.evaluator.criteries.TimeEvaluator;

/**
 * The type Time evaluator factory.
 */
public class TimeEvaluatorFactory implements EvaluatorFactory {
    @Override
    public Evaluator createEvaluator(Evaluator evaluator) {
        return new TimeEvaluator(evaluator);
    }
}
