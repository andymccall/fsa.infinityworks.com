package com.infinityworks.fsa.dao;

import com.infinityworks.fsa.model.Establishments;

/**
 * The EstablishmentsDAO interface is
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
public interface EstablishmentsDAO {

    public Establishments getEstablishmentsByLocalAuthorityId(int localAuthorityId);

}
