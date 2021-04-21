package com.company.evaluatorFactory;

import com.company.evaluator.Evaluator;
import com.company.evaluator.criteries.VisitEvaluator;

public class VisitEvaluatorFactory implements EvaluatorFactory {

    @Override
    public Evaluator createEvaluator() {
        return new VisitEvaluator();
    }
}
