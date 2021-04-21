package com.company.evaluatorFactory;

import com.company.evaluator.Evaluator;

/**
 * The interface Evaluator factory.
 */
interface EvaluatorFactory {
    /**
     * Create evaluator evaluator.
     *
     * @return the evaluator
     */
    public Evaluator createEvaluator();
}
