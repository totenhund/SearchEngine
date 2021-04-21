package com.company.evaluator.criteries;

import com.company.evaluator.Evaluator;

public class TrustEvaluator implements Evaluator {

    public TrustEvaluator(){
        System.out.println("Trust evaluator is created");
    }

    @Override
    public float getRating() {
        return 0;
    }
}
