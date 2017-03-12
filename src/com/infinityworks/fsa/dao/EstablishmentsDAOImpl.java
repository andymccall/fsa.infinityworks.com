package com.infinityworks.fsa.dao;

import com.infinityworks.fsa.model.Establishments;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * The EstablishmentsDAOImpl class is the implementation of
 * the EstablishmentsDAO interface.  This class contains the
 *
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
@Repository("establishmentsDAO")
public class EstablishmentsDAOImpl extends BaseDAO implements EstablishmentsDAO {

    @Value("${api.establishments}")
    private String urlEstablishments;

    public Establishments getEstablishmentsByLocalAuthorityId(int localAuthorityId) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(
                getUrlProtocol()+"://" + getUrlBase() + "/" + urlEstablishments)
                .queryParam("name","")
                .queryParam("localAuthorityId", localAuthorityId);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity entity = new HttpEntity(getHttpHeaders());
        ResponseEntity<Establishments> response = restTemplate.exchange(
                builder.buildAndExpand().toUri(),
                HttpMethod.GET,
                entity,
                Establishments.class);

        return response.getBody();

    }

}
