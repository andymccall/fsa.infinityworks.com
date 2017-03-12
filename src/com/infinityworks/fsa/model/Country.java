package com.infinityworks.fsa.model;

/**
 * The Country enum contains details
 * about a post status, such as if it is
 * a draft, published
 *
 * @author  Andy McCall
 * @version 0.2
 * @since   2017-03-01
 */
public enum Country {
    ENGLISH("English"),
    SCOTTISH("Scottish");

    private final String displayName;

    Country(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
