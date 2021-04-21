package com.company;

import com.company.evaluator.Evaluator;
import com.company.evaluatorFactory.TimeEvaluatorFactory;
import com.company.evaluatorFactory.TrustEvaluatorFactory;
import com.company.evaluatorFactory.VisitEvaluatorFactory;

public class Main {

    public static void main(String[] args) {
	    // testing Factory method pattern
        TimeEvaluatorFactory timeEvaluatorFactory = new TimeEvaluatorFactory();
        VisitEvaluatorFactory visitEvaluatorFactory = new VisitEvaluatorFactory();
        TrustEvaluatorFactory trustEvaluatorFactory = new TrustEvaluatorFactory();

        // evaluators
        Evaluator evaluator1 = timeEvaluatorFactory.createEvaluator();
        Evaluator evaluator2 = visitEvaluatorFactory.createEvaluator();
        Evaluator evaluator3 = trustEvaluatorFactory.createEvaluator();


    }
}
