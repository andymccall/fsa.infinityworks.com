package com.infinityworks.fsa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Authority class
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-03-11
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Authority {

    @JsonProperty("LocalAuthorityId")
    private int LocalAuthorityId;
    @JsonProperty("Name")
    private String Name;

    public int getLocalAuthorityId() {
        return LocalAuthorityId;
    }

    public void setLocalAuthorityId(int localAuthorityId) {
        LocalAuthorityId = localAuthorityId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Authority{" +
                "LocalAuthorityId=" + LocalAuthorityId +
                ", Name='" + Name + '\'' +
                '}';
    }
}

