package com.infinityworks.fsa.model;

import java.util.List;

/**
 * The AuthorityStats class contains the details
 * on the ratings of an authority.
 *
 * @author  Andy McCall
 * @version 0.1
 * @since   2017-03-11
 */
public class AuthorityStats {

    /* Raitings for English Authorities */
    private int fiveStar;
    private int fourStar;
    private int threeStar;
    private int twoStar;
    private int oneStar;
    private int exempt;

    /* Raitings for Scottish Authorites */
    private int passAndEatSafe;
    private int pass;
    private int needsImprovement;

    /* Shared */
    private int error;
    private Country country;

    public AuthorityStats(List<Establishment> establishmentList) {
        for (Establishment establishment:establishmentList) {
            switch (establishment.getRatingValue()) {
                case "5":
                    fiveStar++;
                    break;
                case "4":
                    fourStar++;
                    break;
                case "3":
                    threeStar++;
                    break;
                case "2":
                    twoStar++;
                    break;
                case "1":
                    oneStar++;
                    break;
                case "Exempt":
                    exempt++;
                    break;
                case "Pass and Eat Safe":
                    passAndEatSafe++;
                    break;
                case "Pass":
                    pass++;
                    break;
                case "Improvement Required":
                    needsImprovement++;
                    break;
                default:
                    error++;
                    break;
            }
        }
        if (pass > 1 || needsImprovement > 1 || passAndEatSafe > 1) {
            country = Country.SCOTTISH;
        } else {
            country = Country.ENGLISH;
        }
    }

    public int getFiveStar() {
        return fiveStar;
    }

    public float getFiveStarPercent() { return (fiveStar * 100.0f) / getEnglishTotal(); }

    public int getFourStar() {
        return fourStar;
    }

    public float getFourStarPercent() {
        return (fourStar * 100.0f) / getEnglishTotal();
    }

    public int getThreeStar() {
        return threeStar;
    }

    public float getThreeStarPercent() {
        return (threeStar * 100.0f) / getEnglishTotal();
    }

    public int getTwoStar() {
        return twoStar;
    }

    public float getTwoStarPercent() {
        return (twoStar * 100.0f) / getEnglishTotal();
    }

    public int getOneStar() {
        return oneStar;
    }

    public float getOneStarPercent() { return (oneStar * 100.0f) / getEnglishTotal(); }

    public int getExempt() {
        return exempt;
    }

    public float getExemptPercent() {
        return (exempt * 100.0f) / getEnglishTotal();
    }

    public int getPassAndEatSafe() {
        return passAndEatSafe;
    }

    public float getPassAndEatSafePercent()  { return (passAndEatSafe * 100.0f) / getScottishTotal();}

    public int getPass() {
        return pass;
    }

    public float getPassPercent()  { return (pass * 100.0f) / getScottishTotal(); }

    public int getNeedsImprovement() {
        return needsImprovement;
    }

    public float getNeedsImprovementPercent()  { return (needsImprovement * 100.0f) / getScottishTotal();}

    public Country getCountry() {
        return country;
    }

    public int getEnglishTotal() {
        return (oneStar + twoStar + threeStar + fourStar + fiveStar + exempt);
    }

    public int getScottishTotal() {
        return (passAndEatSafe + pass + needsImprovement);
    }

    public int getError() { return error;}

    @Override
    public String toString() {
        return "AuthorityStats{" +
                "fiveStar=" + fiveStar +
                ", fourStar=" + fourStar +
                ", threeStar=" + threeStar +
                ", twoStar=" + twoStar +
                ", oneStar=" + oneStar +
                ", exempt=" + exempt +
                ", pass=" + pass +
                ", needsImprovement=" + needsImprovement +
                ", error=" + error +
                ", country=" + country +
                '}';
    }
}
