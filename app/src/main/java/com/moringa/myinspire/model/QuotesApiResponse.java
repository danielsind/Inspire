
package com.moringa.myinspire.model;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.parceler.Parcel;




public class QuotesApiResponse implements Serializable
{

    @SerializedName("sr")
    @Expose
    private String sr;
    @SerializedName("en")
    @Expose
    private String en;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("source")
    @Expose
    private Object source;
    @SerializedName("numberOfVotes")
    @Expose
    private Integer numberOfVotes;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("addedBy")
    @Expose
    private String addedBy;
    @SerializedName("id")
    @Expose
    private String id;
    private final static long serialVersionUID = 8844670814286950443L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public QuotesApiResponse() {
    }

    /**
     * 
     * @param numberOfVotes
     * @param author
     * @param addedBy
     * @param rating
     * @param en
     * @param source
     * @param id
     * @param sr
     */
    public QuotesApiResponse(String sr, String en, String author, Object source, Integer numberOfVotes, Double rating, String addedBy, String id) {
        super();
        this.sr = sr;
        this.en = en;
        this.author = author;
        this.source = source;
        this.numberOfVotes = numberOfVotes;
        this.rating = rating;
        this.addedBy = addedBy;
        this.id = id;
    }

    public String getSr() {
        return sr;
    }

    public void setSr(String sr) {
        this.sr = sr;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Integer getNumberOfVotes() {
        return numberOfVotes;
    }

    public void setNumberOfVotes(Integer numberOfVotes) {
        this.numberOfVotes = numberOfVotes;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
