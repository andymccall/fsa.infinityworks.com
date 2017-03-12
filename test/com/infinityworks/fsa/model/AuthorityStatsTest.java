package com.infinityworks.fsa.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The AuthorityStatsTest class contains
 * unit tests for the AuthorityStats model.  These
 * unit tests should be maintained prior to the
 * AuthorityStats model being updated
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public class AuthorityStatsTest {


    final private String test1localAuthorityBusinessID = "200";
    final private String test1RatingValue = "5";
    final private String test2localAuthorityBusinessID = "201";
    final private String test2RatingValue = "5";
    final private String test3localAuthorityBusinessID = "202";
    final private String test3RatingValue = "4";
    final private String test4localAuthorityBusinessID = "203";
    final private String test4RatingValue = "3";
    final private String test5localAuthorityBusinessID = "204";
    final private String test5RatingValue = "2";
    final private String test6localAuthorityBusinessID = "205";
    final private String test6RatingValue = "1";
    final private String test7localAuthorityBusinessID = "206";
    final private String test7RatingValue = "1";
    final private String test8localAuthorityBusinessID = "206";
    final private String test8RatingValue = "Exempt";

    private AuthorityStats testAuthorityStats;
    private Establishment testEstablishment1,testEstablishment2,testEstablishment3,
            testEstablishment4,testEstablishment5,testEstablishment6, testEstablishment7, testEstablishment8;
    private Establishments testEstablishments;

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {

        List<Establishment> establishmentList = new ArrayList<>();

        testEstablishment1 = new Establishment();
        testEstablishment1.setLocalAuthorityBusinessID(test1localAuthorityBusinessID);
        testEstablishment1.setRatingValue(test1RatingValue);
        establishmentList.add(testEstablishment1);

        testEstablishment2 = new Establishment();
        testEstablishment2.setLocalAuthorityBusinessID(test2localAuthorityBusinessID);
        testEstablishment2.setRatingValue(test2RatingValue);
        establishmentList.add(testEstablishment2);

        testEstablishment3 = new Establishment();
        testEstablishment3.setLocalAuthorityBusinessID(test3localAuthorityBusinessID);
        testEstablishment3.setRatingValue(test3RatingValue);
        establishmentList.add(testEstablishment3);

        testEstablishment4 = new Establishment();
        testEstablishment4.setLocalAuthorityBusinessID(test4localAuthorityBusinessID);
        testEstablishment4.setRatingValue(test4RatingValue);
        establishmentList.add(testEstablishment4);

        testEstablishment5 = new Establishment();
        testEstablishment5.setLocalAuthorityBusinessID(test5localAuthorityBusinessID);
        testEstablishment5.setRatingValue(test5RatingValue);
        establishmentList.add(testEstablishment5);

        testEstablishment6 = new Establishment();
        testEstablishment6.setLocalAuthorityBusinessID(test6localAuthorityBusinessID);
        testEstablishment6.setRatingValue(test6RatingValue);
        establishmentList.add(testEstablishment6);

        testEstablishment7 = new Establishment();
        testEstablishment7.setLocalAuthorityBusinessID(test7localAuthorityBusinessID);
        testEstablishment7.setRatingValue(test7RatingValue);
        establishmentList.add(testEstablishment7);

        testEstablishment8 = new Establishment();
        testEstablishment8.setLocalAuthorityBusinessID(test8localAuthorityBusinessID);
        testEstablishment8.setRatingValue(test8RatingValue);
        establishmentList.add(testEstablishment8);

        testEstablishments = new Establishments();

        testEstablishments.setEstablishments(establishmentList);

        testAuthorityStats = new AuthorityStats(testEstablishments.asList());

    }

    /**
     * Tests AuthorityStats.toString()
     * with a known value
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "AuthorityStats{fiveStar=2, fourStar=1, threeStar=1, twoStar=1, oneStar=2, exempt=1, pass=0, needsImprovement=0, error=0, country=ENGLISH}",
                testAuthorityStats.toString());




    }

}