package com.infinityworks.fsa.dao;

import com.infinityworks.fsa.model.Authorities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * The AuthoritiesDAOImpl class is the implementation of
 * the AuthoritiesDAO.  This class is
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
@Repository("authoritiesDAO")
public class AuthoritiesDAOImpl extends BaseDAO implements AuthoritiesDAO {

    @Value("${api.authorities.basic}")
    private String authoritiesBasic;

    public Authorities getAllAuthorities() {

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity httpEntity = new HttpEntity(getHttpHeaders());
        ResponseEntity<Authorities> response = restTemplate.exchange(
                getUrlProtocol()+"://"+getUrlBase()+"/"+ authoritiesBasic,
                HttpMethod.GET,
                httpEntity,
                Authorities.class);

        return response.getBody();

    }

}
