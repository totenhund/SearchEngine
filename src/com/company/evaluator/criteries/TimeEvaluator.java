package com.company.evaluator.criteries;

import com.company.evaluator.Evaluator;

public class TimeEvaluator implements Evaluator {

    public TimeEvaluator(){
        System.out.println("Time evaluator is created");
    }

    @Override
    public float getRating() {
        return 0;
    }
}
