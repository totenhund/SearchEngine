package com.company.evaluator;

import com.company.website.Website;

/**
 * The interface Evaluator.
 */
public interface Evaluator {
    /**
     * Gets rating.
     *
     * @param website the website
     * @return the rating
     */
    public float getRating(Website website);
}
