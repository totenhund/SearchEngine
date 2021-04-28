package com.company;

import com.company.evaluator.ConcreteEvaluator;
import com.company.evaluator.Evaluator;
import com.company.evaluatorFactory.TimeEvaluatorFactory;
import com.company.evaluatorFactory.TrustEvaluatorFactory;
import com.company.evaluatorFactory.VisitEvaluatorFactory;
import com.company.website.Website;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // testing Factory method pattern
        TimeEvaluatorFactory timeEvaluatorFactory = new TimeEvaluatorFactory();
        VisitEvaluatorFactory visitEvaluatorFactory = new VisitEvaluatorFactory();
        TrustEvaluatorFactory trustEvaluatorFactory = new TrustEvaluatorFactory();

        // evaluators
        Evaluator concrete = new ConcreteEvaluator();
        Evaluator visitEvaluator = visitEvaluatorFactory.createEvaluator(concrete);
        Evaluator timeEvaluator = timeEvaluatorFactory.createEvaluator(visitEvaluator);
        Evaluator trustEvaluator = trustEvaluatorFactory.createEvaluator(timeEvaluator);

        System.out.println(trustEvaluator.getRating(new Website("", new ArrayList<String>(), new ArrayList<String>())));
    }
}
