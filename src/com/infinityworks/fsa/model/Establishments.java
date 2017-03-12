package com.infinityworks.fsa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * The Establishments class contains all the establishments
 * for a county
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-03-11
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Establishments {

    private List<Establishment> establishments;

    public List<Establishment> asList() {
        return establishments;
    }

    public void setEstablishments(List<Establishment> establishments) {
        this.establishments = establishments;
    }

    @Override
    public String toString() {
        return "Establishments{" +
                "establishments=" + establishments +
                '}';
    }

}
