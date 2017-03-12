package com.infinityworks.fsa.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The EstablishmentTest class contains
 * unit tests for the Establishment model.  These
 * unit tests should be maintained prior to the
 * Establishment model being updated
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public class EstablishmentTest {

    final private String test1localAuthorityBusinessID = "200";
    final private String test1RatingValue = "5";

    private Establishment testEstablishment;

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {

        testEstablishment = new Establishment();

    }

    /**
     * Tests Establishment.getLocalAuthorityBusinessID() and Authority.setLocalAuthorityBusinessID()
     * with a known value
     */
    @Test
    public void Authority_setAndGetLocalAuthorityBusinessID_Passes() throws Exception {
        testEstablishment.setLocalAuthorityBusinessID(test1localAuthorityBusinessID);
        Assert.assertEquals(testEstablishment.getLocalAuthorityBusinessID(), test1localAuthorityBusinessID);
    }

    /**
     * Tests Establishment.getRatingValue() and Establishment.setRatingValue()
     * with a known value
     */
    @Test
    public void Authority_setAndGetRatingValue_Passes() throws Exception {
        testEstablishment.setRatingValue(test1RatingValue);
        Assert.assertEquals(testEstablishment.getRatingValue(), test1RatingValue);
    }

    /**
     * Tests Establishment.toString()
     * with a known value
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        testEstablishment.setLocalAuthorityBusinessID(test1localAuthorityBusinessID);
        testEstablishment.setRatingValue(test1RatingValue);
        Assert.assertEquals( "toString() has failed",
                "Establishment{localAuthorityBusinessID='200', ratingValue='5'}", testEstablishment.toString());
    }

}