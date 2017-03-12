package com.infinityworks.fsa.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The AuthorityTest class contains
 * unit tests for the Authority model.  These
 * unit tests should be maintained prior to the
 * Authority model being updated
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public class AuthorityTest {

    final private int test1LocalAuthorityId = 200;
    final private String test1Name = "QWERTY";

    private Authority testAuthority;

    /**
     * Sets up objects needed for the tests.
     */
    @Before
    public void setUp() throws Exception {

        testAuthority = new Authority();

        testAuthority.setLocalAuthorityId(test1LocalAuthorityId);

        testAuthority.setName(test1Name);

    }

    /**
     * Tests Authority.getLocalAuthorityId() and Authority.setLocalAuthorityId()
     * with a known value
     */
    @Test
    public void Authority_setAndgGetLocalAuthorityId_Passes() throws Exception {
        Assert.assertEquals(testAuthority.getLocalAuthorityId(), test1LocalAuthorityId);
    }

    /**
     * Tests Authority.getName() and Authority.setName()
     * with a known value
     */
    @Test
    public void Authority_setAndGetLocalName_Passes() throws Exception {
        Assert.assertEquals(testAuthority.getName(), test1Name);
    }

    /**
     * Tests Authority.toString()
     * with a known value
     */
    @Test
    public void toString_StringReturned_Passes() throws Exception {
        Assert.assertEquals( "toString() has failed",
                "Authority{LocalAuthorityId=200, Name='QWERTY'}", testAuthority.toString());
    }

}