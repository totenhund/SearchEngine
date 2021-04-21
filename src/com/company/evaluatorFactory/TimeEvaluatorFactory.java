package com.company.evaluatorFactory;

import com.company.evaluator.Evaluator;
import com.company.evaluator.criteries.TimeEvaluator;

public class TimeEvaluatorFactory implements EvaluatorFactory {
    @Override
    public Evaluator createEvaluator() {
        return new TimeEvaluator();
    }
}
