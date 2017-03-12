package com.infinityworks.fsa.model;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The CountryTest class contains
 * unit tests for the Country enum.  These
 * unit tests should be maintained prior to the
 * Country enum being updated
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public class CountryTest {

    private Country country;

    /**
     * Tests Country.getDisplayName() to ensure the correct
     * values are returned
     */
    @Test
    public void County_getDisplayName_Passes() throws Exception {
        country = Country.ENGLISH;
        Assert.assertEquals(country.getDisplayName(), "English");

        country = Country.SCOTTISH;
        Assert.assertEquals(country.getDisplayName(), "Scottish");

    }

}