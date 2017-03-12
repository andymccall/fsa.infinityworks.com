package com.infinityworks.fsa.service;

import com.infinityworks.fsa.dao.AuthoritiesDAO;
import com.infinityworks.fsa.model.Authority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The AuthoritiesServiceImpl class is the implementation of
 * the AuthoritiesService interface.  This class contains the
 *
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
@Service("authoritiesService")
public class AuthoritiesServiceImpl implements AuthoritiesService {

    @Autowired
    private AuthoritiesDAO authoritiesDAO;

    public List<Authority> getAuthorities() {
        return authoritiesDAO.getAllAuthorities().asList();
    }

}
