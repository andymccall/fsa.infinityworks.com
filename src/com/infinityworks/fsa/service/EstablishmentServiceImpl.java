package com.infinityworks.fsa.service;

import com.infinityworks.fsa.dao.EstablishmentsDAO;
import com.infinityworks.fsa.model.Establishment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The EstablishmentServiceImpl class is the implementation of
 * the EstablishmentService interface.  This class contains the
 *
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
@Service("establishmentService")
public class EstablishmentServiceImpl implements EstablishmentService {

    @Autowired
    private EstablishmentsDAO establishmentsDAO;

    public List<Establishment> getEstablishmentsByLocalAuthorityId(int localAuthorityId) {
        return establishmentsDAO.getEstablishmentsByLocalAuthorityId(localAuthorityId).asList();
    }

}
