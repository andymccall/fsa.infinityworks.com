package com.infinityworks.fsa.service;

import com.infinityworks.fsa.dao.EstablishmentsDAO;
import com.infinityworks.fsa.model.Establishment;
import com.infinityworks.fsa.model.Establishments;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * The EstablishmentServiceImplTest class contains
 * unit tests for the EstablishmentServiceImpl
 * implementation.  These unit tests should be
 * maintained prior to the EstablishmentServiceImpl
 * model being updated
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public class EstablishmentServiceImplTest {

    @Mock
    private EstablishmentsDAO mockEstablishmentsDAO;

    @InjectMocks
    private EstablishmentService establishmentServiceImpl = new EstablishmentServiceImpl();

    final private int localAuthorityId = 300;

    final private String test1localAuthorityBusinessID = "200";
    final private String test1RatingValue = "5";

    private Establishment testEstablishment;
    private Establishments testEstablishments;
    private EstablishmentService establishmentService;

    @Before
    public void setUp() throws Exception {

        testEstablishment = new Establishment();
        testEstablishment.setLocalAuthorityBusinessID(test1localAuthorityBusinessID);
        testEstablishment.setRatingValue(test1RatingValue);

        List<Establishment> establishmentList = new ArrayList<>();
        establishmentList.add(testEstablishment);

        testEstablishments = new Establishments();

        testEstablishments.setEstablishments(establishmentList);

        MockitoAnnotations.initMocks(this);

        when(mockEstablishmentsDAO.getEstablishmentsByLocalAuthorityId(localAuthorityId)).thenReturn(testEstablishments);

    }

    /**
     * Tests EstablishmentsService.getEstablishmentsByLocalAuthorityId()
     * with a known value
     */
    @Test
    public void EstablishmentsService_getEstablishmentsByLocalAuthorityId_Passes() throws Exception {
         List<Establishment> establishmentList = establishmentServiceImpl.getEstablishmentsByLocalAuthorityId(localAuthorityId);

        System.out.println(establishmentList);

        Assert.assertEquals("getEstablishmentsByLocalAuthorityId() failed",
                test1localAuthorityBusinessID,
                establishmentList.get(0).getLocalAuthorityBusinessID());

    }
}