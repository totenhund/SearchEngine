package com.company;

import com.company.accessHandler.AuthHandler;
import com.company.accessHandler.WebsiteContentHandler;
import com.company.accessHandler.requests.Request;
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


        // Chain of responsibilities (Snippet of code)
        // Authentication handler
        // Checking tags
        AuthHandler authHandler = new AuthHandler();
        WebsiteContentHandler websiteContentHandler = new WebsiteContentHandler();
        authHandler.setNext(websiteContentHandler);
        // create keywords meta tags with prohibited tag
        ArrayList<String> keyTags = new ArrayList<String>();
        keyTags.add("nudity");
        // create request for handler
        Request request = new Request("1234", "Login", new Website("", new ArrayList<String>(), keyTags));
        // handle request
        authHandler.handle(request);


    }
}
