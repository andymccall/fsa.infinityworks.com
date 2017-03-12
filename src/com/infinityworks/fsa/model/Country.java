package com.infinityworks.fsa.model;

/**
 * The Country enum is allows naming of
 * the country the authority is in
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
