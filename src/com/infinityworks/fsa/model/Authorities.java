package com.infinityworks.fsa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * The Authorities class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-03-11
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Authorities {

    private List<Authority> authorities;

    public List<Authority> asList() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "Authorities{" +
                "authorities=" + authorities +
                '}';
    }

}
