package com.infinityworks.fsa.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andymccall on 12/03/2017.
 */
public class EstablishmentsTest {

    final private String test1localAuthorityBusinessID = "200";
    final private String test1RatingValue = "5";

    private Establishment testEstablishment;
    private Establishments testEstablishments;

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {

        testEstablishment = new Establishment();
        testEstablishment.setLocalAuthorityBusinessID(test1localAuthorityBusinessID);
        testEstablishment.setRatingValue(test1RatingValue);

        List<Establishment> establishmentList = new ArrayList<>();
        establishmentList.add(testEstablishment);

        testEstablishments = new Establishments();

        testEstablishments.setEstablishments(establishmentList);

    }

    /**
     * Tests Establishments.asList()
     * with a known value
     */
    @Test
    public void Esablishments_asList_Passes() throws Exception {

        List<Establishment> testEstablishmentList = testEstablishments.asList();

        Assert.assertEquals("asList() has failed",
                testEstablishmentList.get(0).getLocalAuthorityBusinessID(),
                test1localAuthorityBusinessID);
        Assert.assertEquals("asList() has failed",
                testEstablishmentList.get(0).getRatingValue(),
                test1RatingValue);
    }

    /**
     * Tests Establishments.toString()
     * with a known value
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "Establishments{establishments=[Establishment{localAuthorityBusinessID='200', ratingValue='5'}]}", testEstablishments.toString());
    }

}