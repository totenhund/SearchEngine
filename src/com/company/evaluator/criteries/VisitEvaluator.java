package com.company.evaluator.criteries;

import com.company.evaluator.Evaluator;

public class VisitEvaluator implements Evaluator {

    public VisitEvaluator(){
        System.out.println("Visit evaluator is created");
    }

    @Override
    public float getRating() {
        return 0;
    }
}
