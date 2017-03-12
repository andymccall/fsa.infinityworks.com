package com.infinityworks.fsa.service;

import com.infinityworks.fsa.model.Establishment;

import java.util.List;

/**
 * The EstablishmentService interface is
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public interface EstablishmentService {

    public List<Establishment> getEstablishmentsByLocalAuthorityId(int localAuthorityId);

}
