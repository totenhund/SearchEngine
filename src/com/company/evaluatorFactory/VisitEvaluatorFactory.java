package com.company.evaluatorFactory;

import com.company.evaluator.ConcreteEvaluator;
import com.company.evaluator.Evaluator;
import com.company.evaluator.criteries.VisitEvaluator;

/**
 * The type Visit evaluator factory.
 */
public class VisitEvaluatorFactory implements EvaluatorFactory {

    @Override
    public Evaluator createEvaluator() {
        return new VisitEvaluator(new ConcreteEvaluator());
    }
}
