package com.company.evaluator.decorator;

import com.company.evaluator.Evaluator;
import com.company.website.Website;

public class EvaluatorDecorator implements Evaluator {

    Evaluator wrapper;

    public EvaluatorDecorator(Evaluator source){
        this.wrapper = source;
    }

    @Override
    public float getRating(Website website) {
        return this.wrapper.getRating(website);
    }
}
