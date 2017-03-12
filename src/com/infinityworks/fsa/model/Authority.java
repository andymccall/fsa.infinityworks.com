package com.infinityworks.fsa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andymccall on 09/03/2017.
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

