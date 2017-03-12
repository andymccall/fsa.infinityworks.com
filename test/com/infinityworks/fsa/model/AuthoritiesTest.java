package com.infinityworks.fsa.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * The AuthoritiesTest class contains
 * unit tests for the Authorities model.  These
 * unit tests should be maintained prior to the
 * Authorities model being updated
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public class AuthoritiesTest {

    final private int test1LocalAuthorityId = 200;
    final private String test1Name = "QWERTY";

    private Authority testAuthority;
    private Authorities testAuthorities;

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {

        testAuthority = new Authority();

        testAuthority.setLocalAuthorityId(test1LocalAuthorityId);

        testAuthority.setName(test1Name);

        List<Authority> authorityList = new ArrayList<>();
        authorityList.add(testAuthority);

        testAuthorities = new Authorities();
        testAuthorities.setAuthorities(authorityList);

    }

    /**
     * Tests Authorities.asList()
     * with a known value
     */
    @Test
    public void Authorities_asList_Passes() throws Exception {

        List<Authority> testAuthorityList = testAuthorities.asList();

        Assert.assertEquals("asList() has failed",
                testAuthorityList.get(0).getLocalAuthorityId(),
                test1LocalAuthorityId);
        Assert.assertEquals("asList() has failed",
                testAuthorityList.get(0).getName(),
                test1Name);
    }

    /**
     * Tests Authorities.toString()
     * with a known value
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "Authorities{authorities=[Authority{LocalAuthorityId=200, Name='QWERTY'}]}", testAuthorities.toString());
    }


}