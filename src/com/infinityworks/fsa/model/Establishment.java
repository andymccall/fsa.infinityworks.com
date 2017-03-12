package com.infinityworks.fsa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Establishment class is the data model
 * for the Establishment json object
 *
 *
 * @author Andy McCall
 * @version 0.1
 * @since 2017-03-11
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Establishment {

    @JsonProperty("LocalAuthorityBusinessID")
    private String localAuthorityBusinessID;
    @JsonProperty("RatingValue")
    private String ratingValue;

    public String getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(String ratingValue) {

        this.ratingValue = ratingValue;

    }

    public String getLocalAuthorityBusinessID() {
        return localAuthorityBusinessID;
    }

    public void setLocalAuthorityBusinessID(String localAuthorityBusinessID) {

        this.localAuthorityBusinessID = localAuthorityBusinessID;

    }

    @Override
    public String toString() {
        return "Establishment{" +
                "localAuthorityBusinessID='" + localAuthorityBusinessID + '\'' +
                ", ratingValue='" + ratingValue + '\'' +
                '}';
    }
}
